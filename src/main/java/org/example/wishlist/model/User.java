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
        this.passcode = passcode;
    }

    public int getBrugerID() {
        return brugerID;
    }

    public void setBrugerID(int brugerID) {
        this.brugerID = brugerID;
    }

    public String getFornavn() {
        return first_name;
    }

    public void setFornavn(String fornavn) {
        this.first_name = fornavn;
    }

    public String getEfternavn() {
        return last_name;
    }

    public void setEfternavn(String efternavn) {
        this.last_name = efternavn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrugernavn() {
        return username;
    }

    public void setBrugernavn(String brugernavn) {
        this.username = brugernavn;
    }

    public String getPassword() {
        return passcode;
    }

    public void setPassword(String password) {
        this.passcode = password;
    }
}
