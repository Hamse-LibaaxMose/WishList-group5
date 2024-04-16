package org.example.wishlist.model;

public class Wish {
    public String wishName;
    public String description;

    public String url; //Link

    public String imageUrl; //billede

    public Wish() {
    }

    public Wish(String wishName, String description, String url, String imageUrl) {
        this.wishName = wishName;
        this.description = description;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    public String getWishName() {
        return wishName;
    }

    public void setWishName(String wishName) {
        this.wishName = wishName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
