package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        User u = new User();
        u.set_name("Alex");
        u.membership = "Gold";

        User u2 = new User();
        u2.set_name("Tom");
        u2.membership = "Premium";

        System.out.println(u.get_name());
        System.out.println(u2.get_name());
    }
}
