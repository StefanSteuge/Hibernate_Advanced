package com.example.Hibernate.service;

import com.example.Hibernate.dao.Category;
import com.example.Hibernate.repositories.CategoryRepo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Service
public class CategoryService {

   private final CategoryRepo categoryRepo;

    public CategoryService(CategoryRepo categoryRepo) {
        this.categoryRepo = categoryRepo;
    }


    @PostConstruct
    void init(Category category) {
        Category accessories = new Category("accessories");
        Category clothing = new Category("clothing");
        Category footwear = new Category("spot shoes");
        categoryRepo.saveAll(Arrays.asList(accessories, clothing, footwear));
    }

    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    public Iterable<Category> getCategory() {
        return categoryRepo.findAll();
    }

}
