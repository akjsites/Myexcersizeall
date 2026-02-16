package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {
    private String name;
    private String cuisineType;
    private String location;
    private String description;
    private Double deliveryFee;
    private Integer deliveryTime;
    private MultipartFile image;
}