package org.learning.pakshi;

public class Sparrow extends Bird {

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
