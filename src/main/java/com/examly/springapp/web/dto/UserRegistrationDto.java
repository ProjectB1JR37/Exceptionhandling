package com.examly.springapp.web.dto;

import javax.validation.constraints.Email;

public class UserRegistrationDto {

    private String email;
    private String userName;
    private String userMobileNumber;
    private String userPassword;
    private String userRetypePassword;

    public UserRegistrationDto() {
    }

    public UserRegistrationDto(String email, String userName, String userMobileNumber, String userPassword, String userRetypePassword) {
        this.email = email;
        this.userName = userName;
        this.userMobileNumber = userMobileNumber;
        this.userPassword = userPassword;
        this.userRetypePassword = userRetypePassword;
    }

    public UserRegistrationDto(String email, String userPassword) {
        this.email = email;
        this.userPassword = userPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobileNumber() {
        return userMobileNumber;
    }

    public void setUserMobileNumber(String userMobileNumber) {
        this.userMobileNumber = userMobileNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRetypePassword() {
        return userRetypePassword;
    }

    public void setUserRetypePassword(String userRetypePassword) {
        this.userRetypePassword = userRetypePassword;
    }
}
