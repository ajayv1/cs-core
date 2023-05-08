package org.learning.design.prototype.user;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserObjectTest {
    private UserObjectRegistry registry;

    @Before
    public void setUp() {
        registry = new UserObjectRegistry();

        UserObject student = new UserObject("Ajay", "Verma", 1, 123, UserObjectType.STUDENT);

        registry.store(student, UserObjectType.STUDENT);
    }

    @After
    public void tearDown() {
        registry = null;
    }

    @Test
    public void testUserObject() {
        UserObject prototype = new UserObject("Ajay", "Verma", 1, 123, UserObjectType.STUDENT);

        UserObject clone = prototype.clone();

        assertNotNull("if clone mtd is called, clone should not be null", clone);

        clone.setFname("Vijay");

        assertNotEquals("if prototype is cloned, clone and prototype should not be same", prototype.getFname(), clone.getFname());
    }

    @Test
    public void testUserObjectWithRegistry() {
        UserObject prototype = registry.get(UserObjectType.STUDENT);
        UserObject clone = prototype.clone();

        assertNotNull("if clone mtd is called, clone should not be null", clone);

        clone.setFname("Vijay");

        assertNotEquals("if prototype is cloned, clone and prototype should not be same", prototype.getFname(), clone.getFname());

    }
}
