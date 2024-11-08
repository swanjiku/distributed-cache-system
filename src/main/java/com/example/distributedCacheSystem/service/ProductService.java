package com.example.distributedCacheSystem.service;

import com.example.distributedCacheSystem.model.Product;
import com.example.distributedCacheSystem.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Cacheable(value = "productCache", key = "#id")
    public Product getProductById(String id) {
        simulateSlowService();
        return productRepository.findById(id);
    }

    private void simulateSlowService() {
        try {
            Thread.sleep(3000); // Simulates slow service
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}