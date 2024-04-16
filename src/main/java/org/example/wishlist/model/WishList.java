package org.example.wishlist.model;

import java.util.List;

public class WishList {

    public List<org.example.wishlist.model.Wish> wishList;

    public WishList(List<Wish> wishList) {
        this.wishList = wishList;
    }

    public List<Wish> getWishList() {
        return wishList;
    }

    public void setWishList(List<Wish> wishList) {
        this.wishList = wishList;
    }
}
