package com.example.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "restaurants")
@Data
@NoArgsConstructor
public class Restaurant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String cuisineType; // Italian, Chinese, Indian, etc.
    
    @Column(nullable = false)
    private String location;
    
    private String description;
    
    @Column(nullable = false)
    private Double deliveryFee;
    
    @Column(nullable = false)
    private Integer deliveryTime; // in minutes
    
    @Column(nullable = false)
    private Double rating = 0.0;
    
    @Column(nullable = false)
    private Boolean isActive = true;
    
    private String imageUrl;
    
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private List<MenuItem> menuItems = new ArrayList<>();
    
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    
    private LocalDateTime updatedAt;
}