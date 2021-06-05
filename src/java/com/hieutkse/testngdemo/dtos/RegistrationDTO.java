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
public class RegistrationDTO {
    
    private String username;
    private String passwor;
    private String fullname;
    private String role;
    

    public RegistrationDTO(String username, String passwor, String fullname, String role) {
        this.username = username;
        this.passwor = passwor;
        this.fullname = fullname;
        this.role = role;
    }

    public RegistrationDTO() {
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswor() {
        return passwor;
    }

    public void setPasswor(String passwor) {
        this.passwor = passwor;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
