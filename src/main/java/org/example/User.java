package org.example;

import java.util.List;

public class User {

    private String _name;
    private String _membership;

    public static List<User> admins;

    public String toString() {
        return get_name() + " " + get_membership();
    }

    public boolean equals(User u2) {
        if (
            get_name() == u2.get_name() &&
            get_membership() == u2.get_membership()
        ) {
            return true;
        }
        return false;
    }

    public User() {}

    public User(String name) {
        set_name(name);
    }

    public User(String name, String membership) {
        // 🙅 Incorrect way
        // _name = name;
        // _membership = membership;
        //
        // ✅ Correct way
        set_name(name);
        set_membership(membership);
    }

    // Encapsulation set method
    void set_name(String name) {
        _name = name;
    }

    // Encapsulation get method
    String get_name() {
        return _name;
    }

    // Encapsulation set method
    void set_membership(String membership) {
        _membership = membership;
    }

    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    public enum Membership {
        Bronze,
        Silver,
        Gold,
    }

    // Encapsulation get method
    String get_membership() {
        return _membership;
    }
}
