package org.learning.pakshi;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Bird {
    // Step 1 - add attributes
    private Double weight;
    private Double size;
    private String color;
    private String beakType;

    // Step 2 - Add behaviors
    public abstract void makeSound();

    public void eating() {
        System.out.println("Bird is eating...");
    }
}
