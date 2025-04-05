package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User.admins = new ArrayList<User>();

        User.admins.add(new User("Peter"));
        User.admins.add(new User("Jhon"));
        User.admins.add(new User("Oleg"));

        User.print_admin_names();
    }
}
