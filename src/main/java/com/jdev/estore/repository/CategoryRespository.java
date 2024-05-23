package com.jdev.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdev.estore.model.Category;

public interface CategoryRespository extends JpaRepository<Category, Long> {
    
}
