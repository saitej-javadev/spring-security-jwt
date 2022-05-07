package com.saitej.springsecurityjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saitej.springsecurityjwt.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
