/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutkse.testngdemo.dtos;

/**
 *
 * @author Admin
 */
public class RegistrationErrorObject {
    private String usernameError;
    private String passwordError;

    public RegistrationErrorObject(String usernameError, String passwordError) {
        this.usernameError = usernameError;
        this.passwordError = passwordError;
    }

    public RegistrationErrorObject() {
    }
    

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }
    
    
}
