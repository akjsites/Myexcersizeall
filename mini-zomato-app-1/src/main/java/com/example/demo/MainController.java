package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
    
    private final UserService userService;
    
    @GetMapping("/")
    public String home() {
        return "index";
    }
    
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginDTO", new LoginDTO());
        return "login";
    }
    
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "register";
    }
    
    @PostMapping("/register")
    public String registerUser(@ModelAttribute UserDTO userDTO) {
        try {
            userService.registerUser(userDTO);
            return "redirect:/login?success";
        } catch (Exception e) {
            return "redirect:/register?error";
        }
    }
    
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        User currentUser = userService.getCurrentUser();
        model.addAttribute("user", currentUser);
        return "dashboard";
    }
    
    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
}