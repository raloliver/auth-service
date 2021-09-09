/*
 * File: RoleRepository.java
 * Project: repository
 * Created: Tuesday, August 31st 2021, 9:50:10 am
 * Last Modified: Thursday, September 9th 2021, 4:17:24 pm
 * Copyright © 2021 AMDE Agência
 */

package com.raloliver.authservice.repository;

import com.raloliver.authservice.domain.Role;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
