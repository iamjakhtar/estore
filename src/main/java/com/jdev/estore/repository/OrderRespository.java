package com.jdev.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdev.estore.model.Order;

public interface OrderRespository extends JpaRepository<Order, Long> {
    
}
