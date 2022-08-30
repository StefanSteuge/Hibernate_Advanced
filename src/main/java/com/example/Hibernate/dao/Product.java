package com.example.Hibernate.dao;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
    private List<ProductParameter> parameters;

    @OneToOne(mappedBy = "product")
    private ProductDescription description;

    @ManyToMany(mappedBy = "products")
    private List<Category> categories;

    private String name;

    private BigDecimal price;

    public Product() {
    }

    public Product(List<ProductParameter> parameters) {
        this.parameters = parameters;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public List<ProductParameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<ProductParameter> parameters) {
        this.parameters = parameters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
