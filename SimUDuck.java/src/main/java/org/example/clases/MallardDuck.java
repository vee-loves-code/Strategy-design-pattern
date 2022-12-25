package org.example.clases;

import org.example.clases.ImplementsFly.FlyWithWings;
import org.example.clases.implementsQuack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
        }

    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck");
    }
}
