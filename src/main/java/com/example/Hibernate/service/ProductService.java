package com.example.Hibernate.service;

import com.example.Hibernate.dao.Product;
import com.example.Hibernate.repositories.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public ProductRepo getProductRepo() {
        return productRepo;
    }

    public void setProductRepo(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @PostConstruct
    void init() {
        Product belt = new Product("Leather Belt", new BigDecimal(45));
        Product tShirt = new Product("T-shirt", new BigDecimal(32));
        Product shoes = new Product("Sneakers", new BigDecimal(84));
        productRepo.saveAll(List.of(shoes, belt, tShirt));
    }

}
