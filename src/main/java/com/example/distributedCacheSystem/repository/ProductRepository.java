package com.example.distributedCacheSystem.repository;

import com.example.distributedCacheSystem.model.Product;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProductRepository {
    private final Map<String, Product> productMap = new HashMap<>();

    public ProductRepository() {
        // Sample data for testing
        productMap.put("1", new Product("1", "Laptop", 1200.0));
        productMap.put("2", new Product("2", "Phone", 800.0));
    }

    public Product findById(String id) {
        return productMap.get(id);
    }
}