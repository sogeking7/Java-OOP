package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        User u = new User("Alex", "Silver");
        User u2 = new User("Alex", "Silver");

        System.out.println(u.get_name() + " " + u.get_membership());
        System.out.println(u); // Printing the value describing memory address
        System.out.println(u2);

        System.out.println(u == u2);
        System.out.println(u.equals(u2));

        ArrayList<User> users = new ArrayList<User>();
        users.add(u);
        users.add(new User("Jhon"));
        users.add(new User("Oleg"));

        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }
}
