package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void insertProduct(Product product) {
        List<Product> all = productRepository.findAll();
        System.out.println(all);
//        if (saved != null) {
//            System.out.println("Inserted product: " + saved);
//        } else {
//            System.out.println("No product inserted");
//        }
    }
}
