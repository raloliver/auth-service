package com.raloliver.authservice.repository;

import com.raloliver.authservice.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Keep attention to the User, because another libraries use the same class
 * name.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
