/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hieutkse.testngdemo.daos;

import com.hieutkse.testngdemo.dbutils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class RegistrationDAO {
    
    Connection conn = null;
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    private void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
    
    public String checkLogin(String usernameInput, String passwordInput) throws Exception {
        String role = "failed";
        try {
            conn = DBUtils.getConnection();
            String sql = "SELECT Username, Password, Role "
                    + "FROM Registration "
                    + "WHERE Username = ? AND Password = ?";
            stm = conn.prepareStatement(sql);
            stm.setString(1, usernameInput);
            stm.setString(2, passwordInput);
            rs = stm.executeQuery();
            if (rs.next()) {
                role = rs.getString("Role");
            }
        } finally {
            closeConnection();
        }
        return role;
    }
    
}
