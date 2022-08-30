package com.example.Hibernate.dao;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String category;

    @ManyToMany
    @JoinTable(
            name = "Products_Category",
            joinColumns = @JoinColumn(name = "Category_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "Products_ID", referencedColumnName = "ID")
    )
    private List<Product> products;

    public Category(String category) {
        this.category = category;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
