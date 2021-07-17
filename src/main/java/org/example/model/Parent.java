package org.example.model;

public class Parent {
    protected String name;

    public String getName() {
        throw new RuntimeException("override!");
    }
}
