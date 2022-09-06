package com.example.Hibernate.service;

import com.example.Hibernate.dao.Product;
import com.example.Hibernate.repositories.ProductRepo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    void init(Product product) {
        Product belt = new Product("Leather belt", BigDecimal.valueOf(45));
        Product tShirt = new Product("T-shirt", BigDecimal.valueOf(32));
        Product shoes = new Product("Sneakers", BigDecimal.valueOf(84));
        productRepo.saveAll(Arrays.asList(belt,tShirt,shoes));
    }

    public Product createProduct(Product product){
            return productRepo.save(product);
    }

    public Iterable<Product> getProducts(){
        return productRepo.findAll();
    }

}
