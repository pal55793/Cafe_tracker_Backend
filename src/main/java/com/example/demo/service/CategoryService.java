package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Category;

public interface CategoryService {

    Category create(Category category);

    Category update(String id, Category category);

    Optional<Category> getById(String id);

    List<Category> getAll();

    void delete(String id);
}