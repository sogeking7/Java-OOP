package org.example;

public class User {

    private String _name;
    private String _membership;

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
