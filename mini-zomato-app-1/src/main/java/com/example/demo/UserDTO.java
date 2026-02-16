package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String email;
    private String password;
    private String fullName;
    private String phone;
    private String address;
    private MultipartFile profileImage;
}