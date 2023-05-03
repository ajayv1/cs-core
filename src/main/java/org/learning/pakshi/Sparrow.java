package org.learning.pakshi;

import org.learning.pakshi.abstractBird.FlyableBird;

public class Sparrow extends FlyableBird {

    public Sparrow(Double weight, Double size, String color, String beakType) {
        super(weight, size, color, beakType);
    }
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow is making a sound");
    }
}
