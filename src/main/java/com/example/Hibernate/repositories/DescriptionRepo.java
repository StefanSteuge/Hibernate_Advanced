package com.example.Hibernate.repositories;

import com.example.Hibernate.dao.ProductDescription;
import org.springframework.data.repository.CrudRepository;

public interface DescriptionRepo extends CrudRepository<ProductDescription, Long> {
}
