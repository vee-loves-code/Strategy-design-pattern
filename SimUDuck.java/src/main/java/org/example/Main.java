package org.example;

import org.example.clases.Duck;
import org.example.clases.FlyRocketPowered;
import org.example.clases.MallardDuck;
import org.example.clases.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.perfromFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.perfromFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.perfromFly();
    }
}