package com.example.showcase.repository;

import com.example.showcase.model.Product;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

@Component
public class InMemoryRepository {
    private Map<Integer, Product> database = Map.of(
            1, new Product(1, "productA", "https://www.pudim.com.br/pudim.jpg", "some product A"),
            2, new Product(2, "productB", "https://www.pudim.com.br/pudim.jpg", "some product B"),
            3, new Product(3, "productC", "https://www.pudim.com.br/pudim.jpg", "some product C"),
            4, new Product(4, "productD", "https://www.pudim.com.br/pudim.jpg", "some product D")
    );

    public Product getProductById(Integer id) {
        return database.get(id);
    }

    public Collection<Product> getProducts() {
        return database.values();
    }
}
