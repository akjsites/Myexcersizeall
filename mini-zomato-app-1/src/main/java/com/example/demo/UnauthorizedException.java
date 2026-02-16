package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class UnauthorizedException extends RuntimeException {
    
    public UnauthorizedException() {
        super("You are not authorized to access this resource");
    }
    
    public UnauthorizedException(String message) {
        super(message);
    }
    
    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public UnauthorizedException(String resourceName, String action) {
        super(String.format("You are not authorized to %s %s", action, resourceName));
    }
    
    public UnauthorizedException(String resourceName, Long resourceId, String action) {
        super(String.format("You are not authorized to %s %s with ID: %d", 
            action, resourceName, resourceId));
    }
}