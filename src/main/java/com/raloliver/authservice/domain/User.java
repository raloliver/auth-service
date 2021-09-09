/*
 * File: User.java
 * Project: domain
 * Created: Tuesday, August 31st 2021, 7:39:30 am
 * Last Modified: Thursday, September 9th 2021, 4:17:35 pm
 * Copyright © 2021 AMDE Agência
 */

package com.raloliver.authservice.domain;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Data from lombok to auto generate getters and setters and constructors
 *       (@NoArgsConstructor @AllArgsConstructor).
 * @Collection for Role and Annotation @ManyToMany, example:
 * @ManyToMany (fetch = EAGER) to load user and roles at the same time.
 * 
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<Role>();

}
