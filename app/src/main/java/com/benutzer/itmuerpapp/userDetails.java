package com.benutzer.itmuerpapp;

/**
 * Created by amitesh on 10/4/15.
 */
public class userDetails {
    private String _username;
    private String _password;

    public userDetails(){

    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public void set_username(String _username) {
        this._username = _username;
    }

    public String get_password() {
        return _password;
    }

    public String get_username() {
        return _username;
    }

}
