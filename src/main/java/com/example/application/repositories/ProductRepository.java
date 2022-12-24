package com.example.application.repositories;

import com.example.application.entities.Product;

public class ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAll() {
    }
}
