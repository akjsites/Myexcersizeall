package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
	List<Restaurant> findByIsActiveTrue();

	List<Restaurant> findByCuisineTypeAndIsActiveTrue(String cuisineType);

	List<Restaurant> findByOwnerId(Long ownerId);

	List<Restaurant> findByLocationContainingIgnoreCase(String location);
}