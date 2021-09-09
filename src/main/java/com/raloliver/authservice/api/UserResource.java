/*
 * File: UserResource.java
 * Project: api
 * Created: Tuesday, August 31st 2021, 7:52:27 pm
 * Last Modified: Thursday, September 9th 2021, 4:17:41 pm
 * Copyright © 2021 AMDE Agência
 */

package com.raloliver.authservice.api;

import com.raloliver.authservice.service.UserService;

import java.net.URI;
import java.util.List;

import com.raloliver.authservice.domain.Role;
import com.raloliver.authservice.domain.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUser() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @PostMapping("/role")
    public ResponseEntity<Role> saveRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    /**
     * There is no response for the user whem add a role
     * 
     * @param form
     * @return
     */
    @PostMapping("/role/add")
    public ResponseEntity<?> addRole(@RequestBody RoleToUserForm form) {
        userService.addUserRole(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}