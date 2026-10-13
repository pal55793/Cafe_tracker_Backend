package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.MenuItem;

public interface MenuItemRepository extends MongoRepository<MenuItem, String> {

    List<MenuItem> findByCategoryId(String categoryId);

    List<MenuItem> findByAvailableTrue();

}