/*
 * File: Role.java
 * Project: domain
 * Created: Tuesday, August 31st 2021, 7:45:46 am
 * Last Modified: Thursday, September 9th 2021, 4:17:32 pm
 * Copyright © 2021 AMDE Agência
 */

package com.raloliver.authservice.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

}
