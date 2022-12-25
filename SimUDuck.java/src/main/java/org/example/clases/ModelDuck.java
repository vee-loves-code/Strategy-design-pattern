package org.example.clases;

import org.example.clases.ImplementsFly.FlyNoWay;
import org.example.clases.implementsQuack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a model Duck");
    }
}
