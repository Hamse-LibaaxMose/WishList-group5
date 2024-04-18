package org.example.wishlist.model;

import java.util.Date;

public class User {

    private int brugerID;

    private String first_name;
    private String last_name;
    private String email;
    private String username;
    private String passcode;

    public User() {
    }

    public User(int brugerID, String first_name, String last_name, String email, String username, String password) {
        this.brugerID = brugerID;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.username = username;
        this.passcode = password;
    }


    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public int getUser_id() {
        return brugerID;
    }
    public String getPasscode() {
        return passcode;
    }


    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setUser_id(int user_id) {
        this.brugerID = user_id;
    }

}







