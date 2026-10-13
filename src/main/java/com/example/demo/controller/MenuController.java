package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MenuRequest;
import com.example.demo.entity.MenuItem;
import com.example.demo.service.MenuService;

@CrossOrigin
@RestController
@RequestMapping("/api/menus")
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @PostMapping
    public ResponseEntity<MenuItem> create(@RequestBody MenuRequest menu) {
        return ResponseEntity.ok(menuService.create(menu));
    }

    @PostMapping("/{id}")
    public ResponseEntity<MenuItem> update(
            @PathVariable String id,
            @RequestBody MenuRequest menu) {

        return ResponseEntity.ok(menuService.update(id, menu));
    }

    @GetMapping("/{id}")
    public ResponseEntity<MenuItem> getById(@PathVariable String id) {
        return menuService.getById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<MenuItem>> getAll() {
        return ResponseEntity.ok(menuService.getAll());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<MenuItem>> getByCategory(@PathVariable String categoryId) {
        return ResponseEntity.ok(menuService.getByCategory(categoryId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        menuService.delete(id);
        return ResponseEntity.noContent().build();
    }
}