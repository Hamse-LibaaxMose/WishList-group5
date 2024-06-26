package org.example.wishlist.repository;

import org.example.wishlist.model.User;
import org.example.wishlist.model.Wish;
import org.example.wishlist.model.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WishRepo {


    @Autowired
    JdbcTemplate template;


    public List<Wish> fetchAllWishes(int wishlist_id){
        String sql = "SELECT * FROM wish WHERE wishlist_id = ?";
        RowMapper<Wish> rowMapper = new BeanPropertyRowMapper<>(Wish.class);
        return template.query(sql, rowMapper, wishlist_id);
    }

    public List<User> fetchAllUsers(){
        String sql = "SELECT * FROM users";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return template.query(sql, rowMapper);
    }

    public boolean userExist(String username, String password){
        String sql = "SELECT COUNT(*) FROM users WHERE username = ? AND BINARY passcode = ?";
        return template.queryForObject(sql, Integer.class,username, password) > 0;
    }

    public boolean userAlreadyExist(String username){
        String sql = "SELECT COUNT(*) FROM users WHERE username = ?";
        return template.queryForObject(sql, Integer.class, username) > 0;
    }

    public User getUser(String username){
        String sql = "SELECT * FROM users WHERE username = ?";
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return template.queryForObject(sql, rowMapper, username);
    }
    public void addUser(User user){
        String sql = "INSERT INTO users (user_id, first_name, last_name, email, username, passcode) VALUES(?,?,?,?,?,?)";
        template.update(sql, user.getUser_id(), user.getFirst_name(), user.getLast_name(), user.getEmail(),
                user.getUsername(), user.getPasscode());
    }

    public List<WishList> fetchAllWishlist(String username){
        String sql = "SELECT * FROM wishlist WHERE user_id =(SELECT user_id FROM users WHERE username = ?)";
        RowMapper<WishList> rowMapper = new BeanPropertyRowMapper<>(WishList.class);
        return template.query(sql, rowMapper, username);
    }
    public void addWishToWishlist(Wish wish, int wishlist_id){
        String sql = "INSERT INTO wish (wish_id, wish_name, wish_price, wishlist_id, reserved) VALUES(?,?,?,?,?)";
        template.update(sql, wish.getWish_id(), wish.getWish_name(), wish.getWish_price(), wishlist_id, false);
    }

    public void addWishlist(WishList wishlist, String username){
        String sql = "INSERT INTO wishlist (wishlist_name, user_id) VALUES (?, (SELECT user_id FROM users WHERE username = ?))";
        template.update(sql, wishlist.getWishlist_name(), username);
    }

    public Boolean deleteWish(int wish_id){
        String sql = "DELETE FROM wish where wish_id = ?";
        return template.update(sql, wish_id) > 0;
    }
    public void updateWish(int id, Wish wish){
        String sql = "UPDATE wish SET wish_name = ?, wish_price = ?, wish_link = ? WHERE wish_id = ?";
        template.update(sql, wish.getWish_name(), wish.getWish_price(), wish.getWish_link(), wish.getWish_id());
    }
    public Boolean deleteWishList(int wishlist_id){
        String sql = "DELETE FROM wishlist WHERE wishlist_id = ?";
        return template.update(sql, wishlist_id) > 0;
    }
}

