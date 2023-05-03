package org.learning.pakshi;

import org.junit.Test;
import org.learning.pakshi.abstractBird.FlyableBird;

import java.util.List;

public class BirdTest {
    @Test
    public void releaseBird() {
        List<FlyableBird> birds = List.of(new Sparrow(null, null, null, null),
                new Parrot(null, null, null, null));

        releaseAllBird(birds);
    }

    public void releaseAllBird(List<FlyableBird> birds) {
        birds.forEach(FlyableBird::fly);
    }
}
