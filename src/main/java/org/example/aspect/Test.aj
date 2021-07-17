package org.example.aspect;

import org.example.model.Parent;

public aspect Test {

    pointcut name(Parent bc): target(bc) && execution(public java.lang.String getName(..));

    after(Parent bc) returning(String s): name(bc) {
        System.out.println("src/main/java/org.example.aspect >>> " + s);
    }
}
