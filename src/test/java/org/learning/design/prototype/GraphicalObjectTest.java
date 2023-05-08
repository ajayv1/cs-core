package org.learning.design.prototype;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

public class GraphicalObjectTest {
    private BackgroundRegistry registry;

    @Before
    public void setUp() {
        registry = new BackgroundRegistry();

        // Create a prototype
        BackgroundObject treePrototype = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);

        registry.store(BackgroundObjectType.TREE, treePrototype);
    }

    @After
    public void tearDown() {
        registry = null;
    }

    @Test
    public void testCloneObject() {
        // Step 3 - create the prototype
        BackgroundObject prototype = new BackgroundObject(0, 0, 0, 0, BackgroundObjectType.TREE);

        // Step 4 - clone the prototype to create a forest
        BackgroundObject clone = prototype.clone();

        assertNotNull("if clone mtd is called, clone should not be null", clone);

        clone.setX(1);
        clone.setY(1);

        assertNotEquals("if prototype is cloned, clone and prototype should not be same", prototype.getX(), clone.getX());
    }

    @Test
    public void testPrototypeWithRegistry() {
        // Get tree prototype
        BackgroundObject prototype = registry.get(BackgroundObjectType.TREE);
        assertNotNull("if clone mtd is called, clone should not be null", prototype);

        BackgroundObject clone = prototype.clone();
        clone.setX(new Random().nextInt());
        clone.setY(new Random().nextInt());

        assertNotEquals("if prototype is cloned, x clone and prototype should not be same", prototype.getX(), clone.getX());
        assertNotEquals("if prototype is cloned, y clone and prototype should not be same", prototype.getY(), clone.getY());

    }
}
