package org.example.clases;

import org.example.interfaces.FlyBehaviour;
import org.example.interfaces.QuackBehaviour;

public abstract class Duck {
FlyBehaviour flyBehaviour;
QuackBehaviour quackBehaviour;

public Duck(){
}

public abstract void display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void perfromFly() {
    flyBehaviour.fly();
}
public void performQuack(){
    quackBehaviour.quack();
}

public void swim(){
    System.out.println("All ducks float, even decoys");
}
}
