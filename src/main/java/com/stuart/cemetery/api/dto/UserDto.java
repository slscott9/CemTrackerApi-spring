package com.stuart.cemetery.api.dto;

public class UserDto {

    private String userName;
    private String email;
    private String password;

    private Integer gravesAdded;

    private Integer cemeteriesAdded;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getGravedAdded() {
        return gravesAdded;
    }

    public void setGravesAdded(Integer gravesAdded) {
        this.gravesAdded = gravesAdded;
    }

    public Integer getCemeteriesAdded() {
        return cemeteriesAdded;
    }

    public void setCemeteriesAdded(Integer cemeteriesAdded) {
        this.cemeteriesAdded = cemeteriesAdded;
    }
}
