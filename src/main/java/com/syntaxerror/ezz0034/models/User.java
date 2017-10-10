
package com.syntaxerror.ezz0034.models;


public class User {
    
    private int id;
    private String user;
    private String login;
    
    public User() {
    }
    
    public User(String user, String login) {
        this.user = user;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
}
