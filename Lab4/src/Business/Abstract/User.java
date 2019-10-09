/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public abstract class User {
    private String password;
    private String userName;
    private String role;
    private Date createdDate;

    public Date getCreatedDate() {
        return createdDate;
    }

    public User(String password, String userName, String role) {
        this.password = password;
        this.userName = userName;
        this.role = role;
        this.createdDate = new Date();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    abstract public boolean verify(String password);

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return getUserName();
    }
    
}
