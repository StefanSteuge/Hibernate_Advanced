package com.example.Hibernate.service;

import com.example.Hibernate.dao.ProductDescription;
import com.example.Hibernate.repositories.DescriptionRepo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class DescriptionService {

    private final DescriptionRepo descriptionRepo;

    public DescriptionService(DescriptionRepo descriptionRepo) {
        this.descriptionRepo = descriptionRepo;
    }

    @PostConstruct
    void createDescription() {
        ProductDescription white = new ProductDescription("white");
        ProductDescription brown = new ProductDescription("brown");
        ProductDescription black = new ProductDescription("black");
        ProductDescription green = new ProductDescription("green");
        ProductDescription red = new ProductDescription("red");
        ProductDescription yellow = new ProductDescription("yellow");
        descriptionRepo.saveAll(Arrays.asList(white, black, brown, yellow, green, red));
    }

    public ProductDescription createDescription(ProductDescription description) {
        return descriptionRepo.save(description);
    }

    public Iterable<ProductDescription> getDescription() {
        return descriptionRepo.findAll();
    }

}
