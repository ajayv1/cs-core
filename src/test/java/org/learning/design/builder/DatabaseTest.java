package org.learning.design.builder;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void testSetters() {
        Database db = new Database();
        db.setHost("localhost");
        db.setPort(32000);

        assertEquals("if host setter is called, host shd be localhost", "localhost", db.getHost());
    }

    @Test
    public void testCtorWithHM() {
        Map<String, Object> hm = new HashMap<>();

        hm.put("host", "localhost");
        hm.put("port", 32000);
        hm.put("username", "ajay");
        hm.put("password", "1234");
        hm.put("id", 12l);
        hm.put("type", DatabaseType.MONGO);

        Database db = new Database(hm);
        assertNotNull("if ctor is called with hm, object should not be null", db);

        assertEquals("if host setter is called, host shd be localhost", "localhost", db.getHost());

        assertEquals("if type setter is called, type shd be MONGO", DatabaseType.MONGO, db.getType());

    }
}
