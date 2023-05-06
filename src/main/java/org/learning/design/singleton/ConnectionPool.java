package org.learning.design.singleton;

public class ConnectionPool {
    // Step 3 - instance variable
    private static ConnectionPool instance = null;

    // step 1: hide constructor
    private ConnectionPool() {}

    // step 2: global access point

    // synchronized makes it thread-safe, but it has performance issue as only one thread would be able to call it.
    // so moving the synchronized to a synchronized block
    /*
    public static synchronized ConnectionPool getInstance() {
        // step 4 - return instance
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }
    */
    public static ConnectionPool getInstance() {
        if (instance == null) { // first check is to
            synchronized (ConnectionPool.class) {
                if (instance == null) {
                    instance = new ConnectionPool();
                }
            }
        }
        // step 4 - return instance

        return instance;
    }
}
