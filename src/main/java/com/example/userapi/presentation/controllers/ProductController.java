package com.example.userapi.presentation.controllers;

import com.example.userapi.businesslogic.models.Product;
import com.example.userapi.businesslogic.services.ProductService;
import com.example.userapi.businesslogic.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET: Retrieve all users
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
