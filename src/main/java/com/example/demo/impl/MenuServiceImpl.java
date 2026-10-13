package com.example.demo.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Repo.CategoryRepository;
import com.example.demo.Repo.MenuItemRepository;
import com.example.demo.dto.MenuRequest;
import com.example.demo.entity.MenuItem;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuItemRepository menuRepository;
    private final CategoryRepository categoryRepository;

    public MenuServiceImpl(MenuItemRepository menuRepository,
                           CategoryRepository categoryRepository) {
        this.menuRepository = menuRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public MenuItem create(MenuRequest menu) {

//        Category category = categoryRepository.findById(menu.getCategoryId())
//                .orElseThrow(() ->
//                        new ResourceNotFoundException("Category not found: " + menu.getCategoryId()));

       
		MenuItem item=MenuItem.builder()
				.available(true)
				.id(menu.getItemId())
				.categoryId(menu.getCategoryId())
				.description(menu.getDescription())
		        .imageUrl(menu.getImageUrl())
		        .name(menu.getName())
		        .prices(menu.getPrices())
		        .build();


        MenuItem saved = menuRepository.save(item);

//        categoryRepository.save(category);

        return saved;
    }

    @Override
    public MenuItem update(String id, MenuRequest request) {

        MenuItem menu = menuRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Menu not found: " + id));
        menu.setId(id);  
        menu.setCategoryId(request.getCategoryId());
        menu.setName(request.getName());
        menu.setDescription(request.getDescription());
        menu.setImageUrl(request.getImageUrl());
        menu.setAvailable(request.getAvailable());
        menu.setPrices(request.getPrices());

        return menuRepository.save(menu);
    }

    @Override
    public Optional<MenuItem> getById(String id) {
        return menuRepository.findById(id);
    }

    @Override
    public List<MenuItem> getAll() {
        return menuRepository.findAll();
    }

    @Override
    public List<MenuItem> getByCategory(String categoryId) {
        return menuRepository.findByCategoryId(categoryId);
    }

    @Override
    public void delete(String id) {

        MenuItem menu = menuRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Menu not found: " + id));

//        Category category = categoryRepository.findById(menu.getCategoryId())
//                .orElse(null);

//        if (category != null ) {
//            category.getMenuId().remove(menu.getId());
//            categoryRepository.save(category);
//        }

        menuRepository.delete(menu);
    }
}