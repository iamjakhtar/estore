package com.jdev.estore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdev.estore.model.Category;
import com.jdev.estore.service.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(("/api/v1/categories"))
@AllArgsConstructor
public class CategoryController {
    
    private CategoryService categoryService;

    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable Long id) {
        Category category = categoryService.getCategoryById(id);
        return new ResponseEntity<>(category, HttpStatus.OK);
    }

    // @GetMapping("/{name}")
    // public ResponseEntity<Category> getCategory(@PathVariable String name) {
    //     Category category = categoryService.getCategoryByName(name);
    //     return new ResponseEntity<>(category, HttpStatus.OK);
    // }

    @PostMapping()
    public ResponseEntity<String> addNewCategory(String categoryName) {
        categoryService.addNewCategory(categoryName);
        String response = categoryName + " category has been added succesfully.";
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
