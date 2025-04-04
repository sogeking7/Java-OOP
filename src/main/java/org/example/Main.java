package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        User u = new User("Alex", "Silver");

        System.out.println(u.get_name() + " " + u.get_membership());
    }
}
