package com.jdev.estore.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jdev.estore.model.Category;
import com.jdev.estore.repository.CategoryRespository;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private CategoryRespository categoryRespository;

    @Override
    public Category getCategoryById(Long categoryId) {
        Optional<Category> category = categoryRespository.findByCategoryId(categoryId);

        try {
            Category unwrappedCategory = unwrapCategory(category);
            return unwrappedCategory;
        } catch (EntityNotFoundException e) {
            throw e;
        }
    }

    @Override
    public Category getCategoryByName(String categoryName) {
        Optional<Category> category = categoryRespository.findByCategoryName(categoryName);

        try {
            Category unwrappedCategory = unwrapCategory(category);
            return unwrappedCategory;
        } catch (EntityNotFoundException e) {
            throw e;
        }
    }


    
    @Override
    public void addNewCategory(String categoryName) {
        try {
            Category category = new Category();
            category.setCategoryName(categoryName);
            categoryRespository.save(category);
        } catch (Exception e) {
            throw e;
        }
    }
    
    private Category unwrapCategory(Optional<Category> category) {
        if (category != null) {
            return category.get();
        } else {
            throw new EntityNotFoundException();
        }
    }
}
