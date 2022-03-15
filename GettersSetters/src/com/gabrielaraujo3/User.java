package com.gabrielaraujo3;

import java.util.Locale;

public class User {

    // PROPRIEDADES (PRIVATE)
    private String firstName;
    private String lastName;

    // SETTER
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // GETTER
    public String getFirstName() {
        return firstName;
    }
}
