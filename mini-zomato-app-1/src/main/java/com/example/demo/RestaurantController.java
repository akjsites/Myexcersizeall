package com.example.demo;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/restaurants")
@RequiredArgsConstructor
public class RestaurantController {
    
    private final RestaurantService restaurantService;
    private final UserService userService;
    
    @GetMapping
    public String getAllRestaurants(Model model) {
        try {
            List<Restaurant> restaurants = restaurantService.getAllRestaurants();
            model.addAttribute("restaurants", restaurants);
            return "restaurants/list";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to load restaurants: " + e.getMessage());
            return "error/general";
        }
    }
    
    @GetMapping("/{id}")
    public String getRestaurantDetails(@PathVariable Long id, Model model) {
        try {
            Restaurant restaurant = restaurantService.getActiveRestaurantById(id);
            model.addAttribute("restaurant", restaurant);
            return "restaurants/details";
        } catch (ResourceNotFoundException e) {
            model.addAttribute("error", "Restaurant not found with ID: " + id);
            return "error/404";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to load restaurant details: " + e.getMessage());
            return "error/general";
        }
    }
    
    @GetMapping("/owner")
    public String getOwnerRestaurants(Model model) {
        try {
            User owner = userService.getCurrentUser();
            List<Restaurant> restaurants = restaurantService.getRestaurantsByOwner(owner.getId());
            model.addAttribute("restaurants", restaurants);
            return "restaurants/owner-list";
        } catch (ResourceNotFoundException e) {
            model.addAttribute("error", "User not found");
            return "error/404";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to load your restaurants: " + e.getMessage());
            return "error/general";
        }
    }
    
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("restaurantDTO", new RestaurantDTO());
        return "restaurants/create";
    }
    
    @PostMapping("/create")
    public String createRestaurant(@ModelAttribute RestaurantDTO restaurantDTO,
                                   RedirectAttributes redirectAttributes) {
        try {
            User owner = userService.getCurrentUser();
            restaurantService.createRestaurant(restaurantDTO, owner.getId());
            redirectAttributes.addFlashAttribute("success", "Restaurant created successfully!");
            return "redirect:/restaurants/owner";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Failed to create restaurant: " + e.getMessage());
            return "redirect:/restaurants/create";
        }
    }
    
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        try {
            Restaurant restaurant = restaurantService.getRestaurantById(id);
            model.addAttribute("restaurant", restaurant);
            model.addAttribute("restaurantDTO", new RestaurantDTO());
            return "restaurants/edit";
        } catch (ResourceNotFoundException e) {
            model.addAttribute("error", "Restaurant not found with ID: " + id);
            return "error/404";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to load restaurant for editing: " + e.getMessage());
            return "error/general";
        }
    }
    
    @PostMapping("/edit/{id}")
    public String updateRestaurant(@PathVariable Long id,
                                   @ModelAttribute RestaurantDTO restaurantDTO,
                                   RedirectAttributes redirectAttributes) {
        try {
            restaurantService.updateRestaurant(id, restaurantDTO);
            redirectAttributes.addFlashAttribute("success", "Restaurant updated successfully!");
            return "redirect:/restaurants/owner";
        } catch (ResourceNotFoundException e) {
            redirectAttributes.addFlashAttribute("error", "Restaurant not found with ID: " + id);
            return "redirect:/restaurants/owner";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Failed to update restaurant: " + e.getMessage());
            return "redirect:/restaurants/edit/" + id;
        }
    }
    
    @PostMapping("/delete/{id}")
    public String deleteRestaurant(@PathVariable Long id,
                                   RedirectAttributes redirectAttributes) {
        try {
            restaurantService.deleteRestaurant(id);
            redirectAttributes.addFlashAttribute("success", "Restaurant deleted successfully!");
            return "redirect:/restaurants/owner";
        } catch (ResourceNotFoundException e) {
            redirectAttributes.addFlashAttribute("error", "Restaurant not found with ID: " + id);
            return "redirect:/restaurants/owner";
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Failed to delete restaurant: " + e.getMessage());
            return "redirect:/restaurants/owner";
        }
    }
    
    @GetMapping("/search")
    public String searchRestaurants(@RequestParam String query, Model model) {
        try {
            List<Restaurant> restaurants = restaurantService.searchRestaurants(query);
            model.addAttribute("restaurants", restaurants);
            model.addAttribute("searchQuery", query);
            return "restaurants/search-results";
        } catch (Exception e) {
            model.addAttribute("error", "Failed to search restaurants: " + e.getMessage());
            return "error/general";
        }
    }
}