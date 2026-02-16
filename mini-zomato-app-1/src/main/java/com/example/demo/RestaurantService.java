package com.example.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    
    private final RestaurantRepository restaurantRepository;
    private final UserService userService;
    private final FileStorageService fileStorageService;
    
    public Restaurant getRestaurantById(Long id) {
        return restaurantRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Restaurant", "id", id));
    }
    
    public Restaurant getActiveRestaurantById(Long id) {
        Restaurant restaurant = getRestaurantById(id);
        if (!restaurant.getIsActive()) {
            throw new ResourceNotFoundException("Restaurant", "id", id);
        }
        return restaurant;
    }
    
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findByIsActiveTrue();
    }
    
    public List<Restaurant> getRestaurantsByOwner(Long ownerId) {
        // Check if owner exists
        if (!userService.userExists(ownerId)) {
            throw new ResourceNotFoundException("User", "id", ownerId);
        }
        
        return restaurantRepository.findByOwnerId(ownerId);
    }
    
    public Restaurant createRestaurant(RestaurantDTO restaurantDTO, Long ownerId) {
        User owner = userService.getUserById(ownerId);
        
        Restaurant restaurant = new Restaurant();
        restaurant.setName(restaurantDTO.getName());
        restaurant.setCuisineType(restaurantDTO.getCuisineType());
        restaurant.setLocation(restaurantDTO.getLocation());
        restaurant.setDescription(restaurantDTO.getDescription());
        restaurant.setDeliveryFee(restaurantDTO.getDeliveryFee());
        restaurant.setDeliveryTime(restaurantDTO.getDeliveryTime());
        restaurant.setOwner(owner);
        
        // Handle restaurant image upload
        if (restaurantDTO.getImage() != null && !restaurantDTO.getImage().isEmpty()) {
            try {
                String imageUrl = fileStorageService.storeFile(restaurantDTO.getImage());
                restaurant.setImageUrl(imageUrl);
            } catch (Exception e) {
                throw new RuntimeException("Failed to upload restaurant image: " + e.getMessage());
            }
        }
        
        return restaurantRepository.save(restaurant);
    }
    
    @Transactional
    public Restaurant updateRestaurant(Long id, RestaurantDTO restaurantDTO) {
        Restaurant restaurant = getRestaurantById(id);
        
        // Check if current user is owner or admin
        User currentUser = userService.getCurrentUser();
        if (!restaurant.getOwner().getId().equals(currentUser.getId()) && 
            !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to update this restaurant");
        }
        
        if (restaurantDTO.getName() != null && !restaurantDTO.getName().isEmpty()) {
            restaurant.setName(restaurantDTO.getName());
        }
        
        if (restaurantDTO.getCuisineType() != null && !restaurantDTO.getCuisineType().isEmpty()) {
            restaurant.setCuisineType(restaurantDTO.getCuisineType());
        }
        
        if (restaurantDTO.getLocation() != null && !restaurantDTO.getLocation().isEmpty()) {
            restaurant.setLocation(restaurantDTO.getLocation());
        }
        
        if (restaurantDTO.getDescription() != null) {
            restaurant.setDescription(restaurantDTO.getDescription());
        }
        
        if (restaurantDTO.getDeliveryFee() != null) {
            restaurant.setDeliveryFee(restaurantDTO.getDeliveryFee());
        }
        
        if (restaurantDTO.getDeliveryTime() != null) {
            restaurant.setDeliveryTime(restaurantDTO.getDeliveryTime());
        }
        
        // Handle restaurant image update
        if (restaurantDTO.getImage() != null && !restaurantDTO.getImage().isEmpty()) {
            try {
                // Delete old image if exists
                if (restaurant.getImageUrl() != null) {
                    fileStorageService.deleteFile(restaurant.getImageUrl());
                }
                String imageUrl = fileStorageService.storeFile(restaurantDTO.getImage());
                restaurant.setImageUrl(imageUrl);
            } catch (Exception e) {
                throw new RuntimeException("Failed to update restaurant image: " + e.getMessage());
            }
        }
        
        restaurant.setUpdatedAt(LocalDateTime.now());
        return restaurantRepository.save(restaurant);
    }
    
    @Transactional
    public void deleteRestaurant(Long id) {
        Restaurant restaurant = getRestaurantById(id);
        
        // Check authorization
        User currentUser = userService.getCurrentUser();
        if (!restaurant.getOwner().getId().equals(currentUser.getId()) && 
            !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to delete this restaurant");
        }
        
        // Delete restaurant image if exists
        if (restaurant.getImageUrl() != null) {
            fileStorageService.deleteFile(restaurant.getImageUrl());
        }
        
        // Soft delete - set isActive to false
        restaurant.setIsActive(false);
        restaurant.setUpdatedAt(LocalDateTime.now());
        restaurantRepository.save(restaurant);
    }
    
    public List<Restaurant> searchRestaurants(String query) {
        return restaurantRepository.findByLocationContainingIgnoreCase(query);
    }
    
    public boolean restaurantExists(Long id) {
        return restaurantRepository.existsById(id);
    }
}