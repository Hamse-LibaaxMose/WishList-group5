package org.example.wishlist.model;

public class Wish {
    //public String wishName;
    //public String description;

    //public String url; //Link

    ///public String imageUrl; //billede

    //public Wish() {
    //}
    private int wish_id;
    private String wish_name;
    private String wish_link;
    private double wish_price;
    private boolean reserved;

    //public Wish(String wishName, String description, String url, String imageUrl) {
    //    this.wishName = wishName;
    //    this.description = description;
    //    this.url = url;
    //    this.imageUrl = imageUrl;
    //}
    public Wish(int wish_id, String wish_name, int wish_price, String wish_link, boolean reserved) {
        this.wish_id = wish_id;
        this.wish_name = wish_name;
        this.wish_price = wish_price;
        this.wish_link = wish_link;
        this.reserved = reserved;
    }

    public Wish(){
    }
    public double getWish_price() {
        return wish_price;
    }
    public int getWish_id() {
        return wish_id;
    }
    public String getWish_name() {
        return wish_name;
    }
    public String getWish_link() {
        return wish_link;
    }
    public void setWish_price(double wish_price) {
        this.wish_price = wish_price;
    }
    public void setWish_id(int wish_id) {
        this.wish_id = wish_id;
    }

    public void setWish_name(String wish_name) {
        this.wish_name = wish_name;
    }

    public void setWish_link(String wish_link) {
        this.wish_link = wish_link;
    }

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    //public String getWishName() {
    //    return wishName;
    //}

   // public void setWishName(String wishName) {
    //    this.wishName = wishName;
    //}

    //public String getDescription() {
    //    return description;
   // }

    //public void setDescription(String description) {
    //    this.description = description;
    //}

    //public String getUrl() {
    //    return url;
    //}

    //public void setUrl(String url) {
    //    this.url = url;
    //}

    ///public String getImageUrl() {
    //    return imageUrl;
    //}

    //public void setImageUrl(String imageUrl) {
    //    this.imageUrl = imageUrl;
   // }
}
