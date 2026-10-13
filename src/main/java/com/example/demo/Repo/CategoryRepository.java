package com.example.demo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Category;

public interface CategoryRepository extends MongoRepository<Category, String> {

}