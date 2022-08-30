package com.example.Hibernate.repositories;

import com.example.Hibernate.dao.ProductParameter;
import org.springframework.data.repository.CrudRepository;

public interface ParameterRepo extends CrudRepository<ProductParameter, Long> {
}
