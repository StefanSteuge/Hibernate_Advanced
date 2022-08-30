package com.example.Hibernate.service;

import com.example.Hibernate.dao.ProductParameter;
import com.example.Hibernate.repositories.ParameterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ParameterService {

    @Autowired
    private ParameterRepo parameter;

    public ParameterService(ParameterRepo parameter) {
        this.parameter = parameter;
    }

    public ParameterRepo getParameter() {
        return parameter;
    }

    public void setParameter(ParameterRepo parameter) {
        this.parameter = parameter;
    }

    @PostConstruct
    void init() {
        ProductParameter xs = new ProductParameter("xs");
        ProductParameter small = new ProductParameter("small");
        ProductParameter middle = new ProductParameter("middle");
        ProductParameter large = new ProductParameter("large");
        ProductParameter xl = new ProductParameter("xl");
        ProductParameter xxl = new ProductParameter("xxl");
        parameter.saveAll(List.of(xs, small, middle, large, xl, xxl));
    }
}
