package com.example.distributedCacheSystem.controller;

import com.example.distributedCacheSystem.model.Product;
import com.example.distributedCacheSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return productService.getProductById(id);
    }
}