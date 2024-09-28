package com.example.userapi.businesslogic.services;

import java.util.List;

import com.example.userapi.businesslogic.models.Product;
import com.example.userapi.dataaccess.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired  // Constructor injection (optional annotation, but best practice to mark it)
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
