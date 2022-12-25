package org.example.clases.ImplementsFly;

import org.example.interfaces.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I am able to fly");
    }
}
