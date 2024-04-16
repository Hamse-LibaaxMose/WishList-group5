package org.example.wishlist.model;

public class Notifikation {
    private String besked;
    private String email;

    public Notifikation() {
    }

    public Notifikation(String besked, String email) {
        this.besked = besked;
        this.email = email;
    }

    public String getBesked() {
        return besked;
    }

    public void setBesked(String besked) {
        this.besked = besked;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Notifikation{" +
                "besked='" + besked + '\'' +
                '}';
    }
}
