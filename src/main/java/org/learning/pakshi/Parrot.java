package org.learning.pakshi;

import org.learning.pakshi.abstractBird.FlyableBird;

public class Parrot extends FlyableBird {
    public Parrot(Double weight, Double size, String color, String beakType) {
        super(weight, size, color, beakType);
    }
    @Override
    public void makeSound() {
        System.out.println("Parrot is making a sound");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
