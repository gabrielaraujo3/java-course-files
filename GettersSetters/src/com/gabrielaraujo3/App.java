
package com.gabrielaraujo3;

public class App {

    public static void main(String[] args) {
        // Array - tamanho fixo
        User[] users = new User[10];
        //[x][x][x]

        for (int i = 0; i < users.length; i++) {
            User actual = new User();
            actual.setFirstName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            users[i] = actual;
        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());










        /*
        *Getters e Setters2-5/3

        User userA = new User();
        userA.setFirstName("Gabriel");
        //System.out.println(userA.getFirstName());

        User userB = new User();
        userB.setFirstName("Apple Incorporation");
        System.out.println(userB.getFirstName());*/
    }
}
