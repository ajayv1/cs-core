package org.learning.design.decorator.interfaces;

// Step 3 - creating base decorator implementing product interface
public class BaseDecorator implements Database {

    private Database database;

    @Override
    public String read() {
        return database.read();
    }

    @Override
    public void write(String val) {
        database.write(val);
    }
}
