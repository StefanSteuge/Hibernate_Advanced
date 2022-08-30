package com.example.Hibernate.repositories;

import com.example.Hibernate.dao.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long> {
}
