package org.example.clases.ImplementsFly;

import org.example.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
