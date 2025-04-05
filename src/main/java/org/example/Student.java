package org.example;

public class Student extends User {

    public Student() {
        super();
    }

    public Student(String name) {
        super(name);
    }

    public Student(String name, String membership) {
        super(name, membership);
    }

    void verify() {
        System.out.println("Verifying through email");
        set_verified(true);
    }
}
