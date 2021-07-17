package org.example.main;

import org.example.model.Parent;
import org.example.model.Child;

public class Main {
    public static void main (String[] args) {
        Parent menu = new Child("a");
        System.out.println(menu.getName());
    }
}
