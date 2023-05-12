package org.learning.design.decorator;

import lombok.AllArgsConstructor;
import org.learning.design.decorator.interfaces.Database;

@AllArgsConstructor
public class CompressionDecorator implements Database {

    private Database database;

    @Override
    public String read() {
        String val = database.read();
        return decompress(val);
    }

    private String decompress(String val) {
        return val + " - decompressed";
    }

    @Override
    public void write(String val) {
        String v = compressVal(val);
        database.write(v);
    }

    private String compressVal(String val) {
        return "compressed - " + val;
    }
}
