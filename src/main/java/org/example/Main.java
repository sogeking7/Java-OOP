package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s = new Student();
        s.set_name("student");
        Teacher t = new Teacher();
        t.set_name("teacher");

        User.admins = new ArrayList<User>();
        User.admins.add(s);
        User.admins.add(t);
        User.admins.add(new Teacher("Peter"));
        User.admins.add(new Student("Jhon"));
        User.admins.add(new Student("Oleg"));

        User.print_admin_names();
        for (User u : User.admins) {
            u.verify();
        }
    }
}
