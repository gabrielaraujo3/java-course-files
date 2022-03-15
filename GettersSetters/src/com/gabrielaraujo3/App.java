package com.gabrielaraujo3;

public class App {

    public static void main(String[] args) {
        User[] users = new User[] {
                new User("Gabriel", "Araujo"),
                new User("Gabriel", "Araujo"),
                new User("Gabriel", "Araujo"),
        };


        //[x][x][x]



        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());
    }

}
