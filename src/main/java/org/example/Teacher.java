package org.example;

public class Teacher extends User {

    public Teacher() {
        super();
    }

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, String membership) {
        super(name, membership);
    }

    void verify() {
        System.out.println("Verifying through phone");
        set_verified(true);
    }
}
