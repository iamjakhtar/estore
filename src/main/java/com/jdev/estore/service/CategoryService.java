package com.jdev.estore.service;

import com.jdev.estore.model.Category;

public interface CategoryService {
    Category getCategoryById(Long categoryId);
    Category getCategoryByName(String categoryName);
    void addNewCategory(String categoryName);
}
