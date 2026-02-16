package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {
    private String name;
    private String description;
    private Double price;
    private String category;
    private Long restaurantId;
    private MultipartFile image;
}