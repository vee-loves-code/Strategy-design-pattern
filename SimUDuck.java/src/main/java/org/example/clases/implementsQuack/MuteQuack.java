package org.example.clases.implementsQuack;

import org.example.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cannot quack");
    }
}
