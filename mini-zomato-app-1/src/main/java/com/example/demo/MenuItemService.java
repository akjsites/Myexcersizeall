package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuItemService {
    
    private final MenuItemRepository menuItemRepository;
    private final RestaurantService restaurantService;
    private final UserService userService;
    private final FileStorageService fileStorageService;
    
    public MenuItem getMenuItemById(Long id) {
        return menuItemRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("MenuItem", "id", id));
    }
    
    public List<MenuItem> getMenuItemsByRestaurant(Long restaurantId) {
        // Check if restaurant exists
        if (!restaurantService.restaurantExists(restaurantId)) {
            throw new ResourceNotFoundException("Restaurant", "id", restaurantId);
        }
        
        return menuItemRepository.findByRestaurantIdAndIsAvailableTrue(restaurantId);
    }
    
    public MenuItem createMenuItem(MenuItemDTO menuItemDTO) {
        Restaurant restaurant = restaurantService.getRestaurantById(menuItemDTO.getRestaurantId());
        
        // Check authorization - only owner or admin can add menu items
        User currentUser = userService.getCurrentUser();
        if (!restaurant.getOwner().getId().equals(currentUser.getId()) && 
            !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to add menu items to this restaurant");
        }
        
        MenuItem menuItem = new MenuItem();
        menuItem.setName(menuItemDTO.getName());
        menuItem.setDescription(menuItemDTO.getDescription());
        menuItem.setPrice(menuItemDTO.getPrice());
        menuItem.setCategory(menuItemDTO.getCategory());
        menuItem.setRestaurant(restaurant);
        
        // Handle menu item image upload
        if (menuItemDTO.getImage() != null && !menuItemDTO.getImage().isEmpty()) {
            try {
                String imageUrl = fileStorageService.storeFile(menuItemDTO.getImage());
                menuItem.setImageUrl(imageUrl);
            } catch (Exception e) {
                throw new RuntimeException("Failed to upload menu item image: " + e.getMessage());
            }
        }
        
        return menuItemRepository.save(menuItem);
    }
    
    @Transactional
    public MenuItem updateMenuItem(Long id, MenuItemDTO menuItemDTO) {
        MenuItem menuItem = getMenuItemById(id);
        
        // Check authorization - only owner or admin can update menu items
        User currentUser = userService.getCurrentUser();
        if (!menuItem.getRestaurant().getOwner().getId().equals(currentUser.getId()) && 
            !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to update this menu item");
        }
        
        if (menuItemDTO.getName() != null && !menuItemDTO.getName().isEmpty()) {
            menuItem.setName(menuItemDTO.getName());
        }
        
        if (menuItemDTO.getDescription() != null) {
            menuItem.setDescription(menuItemDTO.getDescription());
        }
        
        if (menuItemDTO.getPrice() != null) {
            menuItem.setPrice(menuItemDTO.getPrice());
        }
        
        if (menuItemDTO.getCategory() != null && !menuItemDTO.getCategory().isEmpty()) {
            menuItem.setCategory(menuItemDTO.getCategory());
        }
        
        // Handle menu item image update
        if (menuItemDTO.getImage() != null && !menuItemDTO.getImage().isEmpty()) {
            try {
                // Delete old image if exists
                if (menuItem.getImageUrl() != null) {
                    fileStorageService.deleteFile(menuItem.getImageUrl());
                }
                String imageUrl = fileStorageService.storeFile(menuItemDTO.getImage());
                menuItem.setImageUrl(imageUrl);
            } catch (Exception e) {
                throw new RuntimeException("Failed to update menu item image: " + e.getMessage());
            }
        }
        
        return menuItemRepository.save(menuItem);
    }
    
    @Transactional
    public void deleteMenuItem(Long id) {
        MenuItem menuItem = getMenuItemById(id);
        
        // Check authorization
        User currentUser = userService.getCurrentUser();
        if (!menuItem.getRestaurant().getOwner().getId().equals(currentUser.getId()) && 
            !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to delete this menu item");
        }
        
        // Delete menu item image if exists
        if (menuItem.getImageUrl() != null) {
            fileStorageService.deleteFile(menuItem.getImageUrl());
        }
        
        menuItemRepository.delete(menuItem);
    }
    
    @Transactional
    public void toggleMenuItemAvailability(Long id) {
        MenuItem menuItem = getMenuItemById(id);
        
        // Check authorization
        User currentUser = userService.getCurrentUser();
        if (!menuItem.getRestaurant().getOwner().getId().equals(currentUser.getId()) && 
            !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to update this menu item");
        }
        
        menuItem.setIsAvailable(!menuItem.getIsAvailable());
        menuItemRepository.save(menuItem);
    }
    
    public List<MenuItem> getMenuItemsByCategory(Long restaurantId, String category) {
        return menuItemRepository.findByRestaurantIdAndCategory(restaurantId, category);
    }
    
    public boolean menuItemExists(Long id) {
        return menuItemRepository.existsById(id);
    }
}