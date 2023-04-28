package org.learning.pakshi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Bird {
    // Step 1 - add attributes
    private String name;
    private Double weight;
    private String color;
    private Double size;
    private String beakType;
    private BirdType type;

    // Step 2 - Add behaviors
    public void fly() {
        switch (type) {
            case PARROT -> System.out.println("Parrot is flying");
            case PENGUIN -> System.out.println("Penguin is not flying");
            case SPARROW -> System.out.println("Sparrow is flying");
        }

        throw new RuntimeException("Invalid bird type " + type);
    }

    public void makeSound() {
        switch (type) {
            case PARROT -> System.out.println("Parrot is making a sound");
            case PENGUIN -> System.out.println("Penguin is making a sound");
            case SPARROW -> System.out.println("Sparrow is making a sound");
        }

        throw new RuntimeException("Invalid bird type " + type);
    }
}
