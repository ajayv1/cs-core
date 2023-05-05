package org.learning.design.singleton;

public class ConnectionPool {
    // Step 3 - instance variable
    private static ConnectionPool instance;

    // step 1: hide constructor
    private ConnectionPool() {}

    // step 2: global access point
    public static ConnectionPool getInstance() {
        // step 4 - if instance present return, else create, set and return
        if (instance == null) {
            instance = new ConnectionPool();
        }

        return instance;
    }

}
