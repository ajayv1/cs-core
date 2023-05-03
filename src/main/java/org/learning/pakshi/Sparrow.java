package org.learning.pakshi;

import org.learning.pakshi.abstractBird.FlyableBird;
import org.learning.pakshi.interfaces.Flyable;
import org.learning.pakshi.strategies.FlyingBehaviour;
import org.learning.pakshi.strategies.GlidingBehaviour;

public class Sparrow extends Bird implements Flyable{

    private FlyingBehaviour flyingBehaviour;

    public Sparrow(Double weight, Double size, String color, String beakType, FlyingBehaviour flyingBehaviour) {
        super(weight, size, color, beakType);
        this.flyingBehaviour = new GlidingBehaviour();
    }
    @Override
    public void fly() {
        flyingBehaviour.fly();
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making a sound");
    }
}
