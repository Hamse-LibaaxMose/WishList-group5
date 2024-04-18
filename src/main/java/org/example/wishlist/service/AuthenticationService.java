package org.example.wishlist.service;

import org.example.wishlist.model.User;
import org.example.wishlist.model.Wish;
import org.example.wishlist.model.WishList;
import org.example.wishlist.repository.WishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthenticationService {

    @Autowired
    WishRepo wishRepo;

    //public boolean authenticate(String username, String password) {
     //   User user = wishRepo.findByUsername(username);
    //    return user != null && user.getPassword().equals(password);
   // }
    public List<Wish> fetchAllWishes(int wishlist_id) {
        return wishRepo.fetchAllWishes(wishlist_id);
    }

    public List<User> fetchAllUsers(){return wishRepo.fetchAllUsers();}

    public boolean userExist(String username, String password){
        return wishRepo.userExist(username, password);
    }

    public User getUser(String username){
        return wishRepo.getUser(username);
    }

    public List<WishList> fetchWishList(String username){
        return wishRepo.fetchAllWishlist(username);
    }
    public void addUser(User user){
        wishRepo.addUser(user);
    }
    public void addWishToWishlist(Wish wish,int wishlist_id){
        wishRepo.addWishToWishlist(wish, wishlist_id);
    }
    public void addWishlist(WishList wishlist, String username){
        wishRepo.addWishlist(wishlist, username);
    }
    public Boolean deleteWish(int wish_id){
        return wishRepo.deleteWish(wish_id);
    }
    public void updateWish(int id, Wish wish){
        wishRepo.updateWish(id,wish);
    }
    public Boolean deleteWishList(int wishlist_id){
        return wishRepo.deleteWishList(wishlist_id);
    }
    public boolean userAlreadyExist(String username){
        return wishRepo.userAlreadyExist(username);
    }

}
