package com.example.SpringPooling.dao;

import com.example.SpringPooling.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
