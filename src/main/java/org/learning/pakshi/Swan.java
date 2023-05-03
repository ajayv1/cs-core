package org.learning.pakshi;

import org.learning.pakshi.interfaces.Flyable;
import org.learning.pakshi.interfaces.Swimmable;

public class Swan extends Bird implements Flyable, Swimmable {
    public Swan(Double weight, Double size, String color, String beakType) {
        super(weight, size, color, beakType);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void fly() {
        System.out.println("Swan is flying");
    }

    @Override
    public void swim() {
        System.out.println("Swan is swimming");
    }
}
