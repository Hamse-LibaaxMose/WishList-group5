package org.example.wishlist.repository;

import org.example.wishlist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcUserRepository implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{username}, (rs, rowNum) ->
                new User(
                        rs.getInt("brugerID"),
                        rs.getString("fornavn"),
                        rs.getString("efternavn"),
                        rs.getDate("fodselsdag"),
                        rs.getString("email"),
                        rs.getString("brugernavn"),
                        rs.getString("password")
                ));
    }
}
