package org.learning.pakshi.abstractBird;

import org.learning.pakshi.Bird;

public abstract class FlyableBird extends Bird {
    public FlyableBird(Double weight, Double size, String color, String beakType) {
        super(weight, size, color, beakType);
    }

    public abstract void fly();
}
