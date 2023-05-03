package org.learning.pakshi;

import org.junit.Test;
import org.learning.pakshi.abstractBird.FlyableBird;
import org.learning.pakshi.interfaces.Flyable;
import org.learning.pakshi.strategies.GlidingBehaviour;

import java.util.List;

public class BirdTest {
    @Test
    public void releaseBird() {
        List<Flyable> birds = List.of(new Sparrow(null, null, null, null, new GlidingBehaviour()),
                new Parrot(null, null, null, null));

        releaseAllBird(birds);
    }

    public void releaseAllBird(List<Flyable> birds) {
        birds.forEach(Flyable::fly);
    }
}
