package org.example.wishlist.repository;

import org.example.wishlist.model.User;

public interface UserRepository {
    User findByUsername(String username);
}
