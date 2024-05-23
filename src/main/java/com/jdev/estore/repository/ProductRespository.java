package com.jdev.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdev.estore.model.Product;

public interface ProductRespository extends JpaRepository<Product, Long> {
    
}
