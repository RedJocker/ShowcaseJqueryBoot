package com.example.showcase.repository;

import com.example.showcase.model.Product;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

@Component
public class InMemoryRepository {
    private final Map<Integer, Product> database = Map.of(
            1, new Product(
                    1,
                    "Phone name1",
                    "https://static5.depositphotos.com/1000128/486/i/950/depositphotos_4860567-stock-photo-touchscreen-smartphone.jpg",
                    "some product A"
            ),
            2, new Product(
                    2,
                    "Phone name2",
                    "https://media.istockphoto.com/photos/black-smartphone-with-blank-screen-picture-id880911882?k=6&m=880911882&s=612x612&w=0&h=HCmnjZGz1MI4ZZbtbQwbD80QrjoxR6H3rX4oLtNBuf0=",
                    "some product B"
            ),
            3, new Product(
                    3,
                    "Phone name3",
                    "https://www.learningcomputer.com/blog/wp-content/uploads/2016/11/bigstock-Smart-Phone-With-Blue-Screen-I-29625884.jpg",
                    "some product C"
            ),
            4, new Product(
                    4,
                    "Phone name4",
                    "https://www.pudim.com.br/pudim.jpg",
                    "some product D"
            )
    );

    public Product getProductById(Integer id) {
        return database.get(id);
    }

    public Collection<Product> getProducts() {
        return database.values().stream().sorted(Comparator.comparingInt(Product::getId)).toList();
    }
}
