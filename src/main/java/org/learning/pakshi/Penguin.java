package org.learning.pakshi;

import org.learning.pakshi.abstractBird.NonFlyableBird;
import org.learning.pakshi.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {
    public Penguin(String color, Double weight, Double size, String beakType) {
        super(weight, size, color, beakType);
    }


    @Override
    public void swim() {
        System.out.println("Penguin swims.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin make a sound");
    }
}
