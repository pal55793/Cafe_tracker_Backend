package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dto.MenuRequest;
import com.example.demo.entity.MenuItem;

public interface MenuService {

    MenuItem create(MenuRequest menu);

    MenuItem update(String id, MenuRequest menu);

    Optional<MenuItem> getById(String id);

    List<MenuItem> getAll();

    List<MenuItem> getByCategory(String categoryId);

    void delete(String id);
}