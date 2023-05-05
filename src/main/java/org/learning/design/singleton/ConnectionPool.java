package org.learning.design.singleton;

public class ConnectionPool {
    // Step 3 - instance variable
    private static ConnectionPool instance = null;

    // step 1: hide constructor
    private ConnectionPool() {}

    // step 2: global access point
    public static synchronized ConnectionPool getInstance() {
        // step 4 - return instance
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }
}
