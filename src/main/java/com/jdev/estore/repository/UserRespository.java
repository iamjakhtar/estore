package com.jdev.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jdev.estore.model.User;

public interface UserRespository extends JpaRepository<User, Long> {
    
}
