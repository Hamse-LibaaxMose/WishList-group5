package org.example.wishlist.model;

import java.util.Date;

public class User {

    private int brugerID;

    private String fornavn;
    private String efternavn;
    private Date fodselsdag;
    private String email;
    private String brugernavn;
    private String password;

    public User() {
    }

    public User(int brugerID, String fornavn, String efternavn, Date fodselsdag, String email, String brugernavn, String password) {
        this.brugerID = brugerID;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.fodselsdag = fodselsdag;
        this.email = email;
        this.brugernavn = brugernavn;
        this.password = password;
    }

    public int getBrugerID() {
        return brugerID;
    }

    public void setBrugerID(int brugerID) {
        this.brugerID = brugerID;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public Date getFodselsdag() {
        return fodselsdag;
    }

    public void setFodselsdag(Date fodselsdag) {
        this.fodselsdag = fodselsdag;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
