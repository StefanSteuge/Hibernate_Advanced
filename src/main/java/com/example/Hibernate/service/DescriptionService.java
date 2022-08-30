package com.example.Hibernate.service;

import com.example.Hibernate.dao.ProductDescription;
import com.example.Hibernate.repositories.DescriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionRepo descriptionRepo;

    public DescriptionService(DescriptionRepo descriptionRepo) {
        this.descriptionRepo = descriptionRepo;
    }

    public DescriptionRepo getDescriptionRepo() {
        return descriptionRepo;
    }

    public void setDescriptionRepo(DescriptionRepo descriptionRepo) {
        this.descriptionRepo = descriptionRepo;
    }

    @PostConstruct
    void init() {
        ProductDescription white = new ProductDescription("white");
        ProductDescription brown = new ProductDescription("brown");
        ProductDescription black = new ProductDescription("black");
        ProductDescription green = new ProductDescription("green");
        ProductDescription red = new ProductDescription("red");
        ProductDescription yellow = new ProductDescription("yellow");
        descriptionRepo.saveAll(List.of(white, black, brown, yellow, green, red));
    }

}
