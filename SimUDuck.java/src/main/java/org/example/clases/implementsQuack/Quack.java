package org.example.clases.implementsQuack;

import org.example.interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am able to quack");
    }
}
