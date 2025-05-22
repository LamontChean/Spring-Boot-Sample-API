package com.example.sample.model;

public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private boolean status;

    public User(Long id, String username, String email, String password, boolean status) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.status = status;
    }

    // ID
    public Long getId(){
        return this.id;
    }

    // Username
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    // Email
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    // Password
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // Status
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean status){
         this.status=status;
    }

}
