package com.raloliver.authservice.service;

import java.util.List;

import com.raloliver.authservice.domain.Role;
import com.raloliver.authservice.domain.User;

/**
 * Add user and save role for this user, also avoid to user register by the same
 * username(unique)
 */
public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addUserRole(String username, String roleName);

    User getUser(String username);

    // In a real database, you load just chunks, and not all data.
    List<User> getUsers();
}
