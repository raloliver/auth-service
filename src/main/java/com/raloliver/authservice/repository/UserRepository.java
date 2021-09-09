/*
 * File: UserRepository.java
 * Project: repository
 * Created: Tuesday, August 31st 2021, 9:47:42 am
 * Last Modified: Thursday, September 9th 2021, 4:17:27 pm
 * Copyright © 2021 AMDE Agência
 */

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
