package org.learning.design.builder;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DatabaseTest {
    @Test
    public void testConstructor() {
        Database db = new Database("localhost", 44304, "password", "ajay", 12, DatabaseType.MY_SQL);
        assertNotNull("if ctor is called, object should not be null", db);
    }

    @Test(expected=RuntimeException.class)
    public void testInvalidPort() {
        Database db = new Database("localhost", 4434, "password", "ajay", 12, DatabaseType.MY_SQL);
    }
}
