package com.example.showcase.controller;

import com.example.showcase.model.Product;
import com.example.showcase.repository.InMemoryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/product")
public class ProductController {

    final InMemoryRepository repository;

    public ProductController(InMemoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/hello")
    ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello");
    }

    @GetMapping("")
    ResponseEntity<Collection<Product>> products() {
        return ResponseEntity.ok(repository.getProducts());
    }
}
