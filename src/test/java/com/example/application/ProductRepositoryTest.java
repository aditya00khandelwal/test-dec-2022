package com.example.application;

import com.example.application.config.ContainersEnvironment;
import com.example.application.entities.Product;
import com.example.application.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@ExtendWith(SpringEntension.class)
@SpringBootTest(classes = TestcontairsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.Random_PORT)
public class ProductRepositoryTest extends ContainersEnvironment{
    @Autowired
    private ProductRepository productRepository;

    @Test
    public void When_GetProducts_Expect_EmptyList() {
        List<Product> list = productRepository.findAll();
        assertEquals(0, list.size());
    }
}
