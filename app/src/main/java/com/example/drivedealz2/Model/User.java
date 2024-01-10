package com.example.drivedealz2.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    private int ID;
    private String username;
    private String email;
    private String password;
    private int phonenumber;

    public User(int ID, String username, String email, String password, int phonenumber) {
        this.ID = ID;
        this.username = username;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
    }


    // Getters and setters for each property


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}