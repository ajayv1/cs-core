package org.learning.pakshi;

import org.learning.pakshi.abstractBird.NonFlyableBird;

public class Penguin extends NonFlyableBird {
    public Penguin(String color, Double weight, Double size, String beakType) {
        super(weight, size, color, beakType);
    }


    @Override
    public void walk() {
        System.out.println("Penguin walks.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin make a sound");
    }
}
