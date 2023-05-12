package org.learning.design.decorator;

import org.learning.design.decorator.interfaces.Database;

// Step 2 - Base product implementation
public class SimpleDatabase implements Database {
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String val) {
        System.out.println(val);
    }
}
