package com.example.demo;


import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final FileStorageService fileStorageService;
    
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }
    
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new ResourceNotFoundException("User", "email", email));
    }
    
    public User getCurrentUser() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return getUserByEmail(email);
    }
    
    public User registerUser(UserDTO userDTO) {
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new RuntimeException("Email already exists");
        }
        
        User user = new User();
        user.setEmail(userDTO.getEmail());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        user.setFullName(userDTO.getFullName());
        user.setPhone(userDTO.getPhone());
        user.setAddress(userDTO.getAddress());
        user.setRole("USER");
        
        // Handle profile image upload
        if (userDTO.getProfileImage() != null && !userDTO.getProfileImage().isEmpty()) {
            try {
                String imageUrl = fileStorageService.storeFile(userDTO.getProfileImage());
                user.setProfileImage(imageUrl);
            } catch (Exception e) {
                throw new RuntimeException("Failed to upload profile image: " + e.getMessage());
            }
        }
        
        return userRepository.save(user);
    }
    
    @Transactional
    public User updateUser(Long id, UserDTO userDTO) {
        User user = getUserById(id);
        
        // Check if current user is authorized to update this user
        User currentUser = getCurrentUser();
        if (!currentUser.getId().equals(id) && !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to update this user");
        }
        
        if (userDTO.getFullName() != null && !userDTO.getFullName().isEmpty()) {
            user.setFullName(userDTO.getFullName());
        }
        
        if (userDTO.getPhone() != null && !userDTO.getPhone().isEmpty()) {
            user.setPhone(userDTO.getPhone());
        }
        
        if (userDTO.getAddress() != null) {
            user.setAddress(userDTO.getAddress());
        }
        
        // Handle profile image update
        if (userDTO.getProfileImage() != null && !userDTO.getProfileImage().isEmpty()) {
            try {
                // Delete old image if exists
                if (user.getProfileImage() != null) {
                    fileStorageService.deleteFile(user.getProfileImage());
                }
                String imageUrl = fileStorageService.storeFile(userDTO.getProfileImage());
                user.setProfileImage(imageUrl);
            } catch (Exception e) {
                throw new RuntimeException("Failed to update profile image: " + e.getMessage());
            }
        }
        
        return userRepository.save(user);
    }
    
    public void deleteUser(Long id) {
        User user = getUserById(id);
        
        // Check authorization
        User currentUser = getCurrentUser();
        if (!currentUser.getId().equals(id) && !currentUser.getRole().equals("ADMIN")) {
            throw new UnauthorizedException("You are not authorized to delete this user");
        }
        
        // Delete profile image if exists
        if (user.getProfileImage() != null) {
            fileStorageService.deleteFile(user.getProfileImage());
        }
        
        userRepository.delete(user);
    }
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public boolean userExists(Long id) {
        return userRepository.existsById(id);
    }
}