package com.example.Hibernate.controller;

import com.example.Hibernate.dao.Category;
import com.example.Hibernate.dao.Product;
import com.example.Hibernate.dao.ProductDescription;
import com.example.Hibernate.dao.ProductParameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@RequestMapping("/products")
@RestController
public class ProductController {

    @PersistenceContext
    private EntityManager entityManager;


    @PostMapping("/product")
    @Transactional
    public void createProduct() {
        Product product = new Product();
        entityManager.persist(product);
    }

    @PostMapping("/category")
    @Transactional
    public void createCategory() {
        Category category = new Category();
        entityManager.persist(category);
    }

    @PostMapping("/description")
    @Transactional
    public void createDescription() {
        ProductDescription description = new ProductDescription();
        entityManager.persist(description);
    }

    @PostMapping("/parameter")
    @Transactional
    public void createParameter() {
        ProductParameter parameter = new ProductParameter();
        entityManager.persist(parameter);
    }

    @GetMapping("/products")
    public Product getProducts() {
        return entityManager.find(Product.class, 1L);
    }

    @GetMapping("/descriptions")
    public ProductDescription getDescriptions() {
        return entityManager.find(ProductDescription.class, 1L);
    }
}
