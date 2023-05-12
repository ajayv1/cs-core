package org.learning.design.decorator;

import lombok.AllArgsConstructor;
import org.learning.design.decorator.interfaces.BaseDecorator;
import org.learning.design.decorator.interfaces.Database;

@AllArgsConstructor
// Step 4 - implement concrete decorators
public class EncryptionDecorator implements Database {

    private Database database;

    @Override
    public String read() {
        String val = database.read();
        return decryptVal(val);
    }

    private String decryptVal(String val) {
        return val + " - decrypted";
    }

    @Override
    public void write(String val) {
        String encryptedVal = encryptedVal(val);
        database.write(encryptedVal);
    }

    private String encryptedVal(String val) {
        return "Encrypted -" + val;
    }
}
