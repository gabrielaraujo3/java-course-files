package com.gabrielaraujo3;

import java.util.Locale;

public class User {

    // PROPRIEDADES CAMPO (OBJETO)
    private String firstName;
    private String lastName;

    // CONSTRUTOR
    public User(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName;
    }

    // SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // GETTER
    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
