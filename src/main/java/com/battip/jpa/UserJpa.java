package com.battip.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserJpa extends JpaRepository<User,Integer> {
    Optional<User> findById(Integer id);
}
