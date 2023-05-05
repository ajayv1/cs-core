package org.learning.design.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ConnectionPoolTest {
    @Test
    public void testSingleton() {
        ConnectionPool connectionPool = ConnectionPool.getInstance();

        assertNotNull("if getInstance is called, created instance shd not be null", connectionPool);

        ConnectionPool connectionPool1 = ConnectionPool.getInstance();

        assertEquals("from singleton, both instances shd be same", connectionPool1, connectionPool);
    }
}
