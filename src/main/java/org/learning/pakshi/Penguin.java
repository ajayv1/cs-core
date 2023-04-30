package org.learning.pakshi;

public class Penguin extends Bird {
    public Penguin(String color, Double weight, Double size, String beakType) {
        super(weight, size, color, beakType);
    }


    @Override
    public void fly() {
        System.out.println("Penguin does not fly, so we shoyld not have this method as well.");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin make a sound");
    }
}
