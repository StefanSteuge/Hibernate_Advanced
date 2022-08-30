package com.example.Hibernate.service;

import com.example.Hibernate.dao.Category;
import com.example.Hibernate.repositories.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    public CategoryRepo getCategoryRepo() {
        return categoryRepo;
    }

    public void setCategoryRepo(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }

    @PostConstruct
    void init() {
        Category accessories = new Category("accessories");
        Category clothing = new Category("clothing");
        Category footwear = new Category("spot shoes");
        categoryRepo.saveAll(List.of(accessories, clothing, footwear));
    }

}
