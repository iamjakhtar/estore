package com.jdev.estore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdev.estore.model.Category;

@Repository
public interface CategoryRespository extends JpaRepository<Category, Long> {
    Optional<Category> findByCategoryId(Long id);
    Optional<Category> findByCategoryName(String categoryName);
}
