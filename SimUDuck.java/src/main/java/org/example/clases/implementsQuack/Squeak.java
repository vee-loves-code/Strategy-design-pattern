package org.example.clases.implementsQuack;

import org.example.interfaces.QuackBehaviour;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't quack, but i can squeak");
    }
}
