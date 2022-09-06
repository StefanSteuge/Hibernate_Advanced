package com.example.Hibernate.service;

import com.example.Hibernate.dao.ProductParameter;
import com.example.Hibernate.repositories.ParameterRepo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Service
public class ParameterService {

    private final ParameterRepo parameterRepo;

    public ParameterService(ParameterRepo parameterRepo) {
        this.parameterRepo = parameterRepo;
    }


    @PostConstruct
    void createParameter() {
        ProductParameter xs = new ProductParameter("xs");
        ProductParameter small = new ProductParameter("small");
        ProductParameter middle = new ProductParameter("middle");
        ProductParameter large = new ProductParameter("large");
        ProductParameter xl = new ProductParameter("xl");
        ProductParameter xxl = new ProductParameter("xxl");
        parameterRepo.saveAll(Arrays.asList(xs, small, middle, large, xl, xxl));
    }

    public ProductParameter createParameter(ProductParameter parameter){
        return parameterRepo.save(parameter);
    }

    public Iterable<ProductParameter> getParameter(){
        return parameterRepo.findAll();
    }
}
