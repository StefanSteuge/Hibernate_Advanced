package com.example.Hibernate.repositories;

import com.example.Hibernate.dao.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long> {
}
