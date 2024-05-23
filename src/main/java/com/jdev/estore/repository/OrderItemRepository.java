package com.jdev.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdev.estore.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
