package org.learning.design.decorator;

import org.junit.Before;
import org.junit.Test;
import org.learning.design.decorator.interfaces.Database;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {
    private Database database = null;

    @Before
    public void setUp() {
        database = new SimpleDatabase();
    }

    @Test
    public void testDatabase() {
        String value = database.read();
        assertEquals("if base data source is used, it shd return base", "Base", value);
    }

    @Test
    public void testCompression() {
        Database compressed = new CompressionDecorator(database);
        String value = compressed.read();
        assertEquals("if compress data source is used, it shd return base", "Base - decompressed", value);
    }

    @Test
    public void testEncryption() {
        Database encrypted = new EncryptionDecorator(database);
        String value = encrypted.read();

        assertEquals("if encrypted data source is used, it shd return base", "Base - decrypted", value);
    }

    @Test
    public void testCompressionAndEncryption() {
//        Database compressed = new CompressionDecorator(database);
//        Database encrypted = new EncryptionDecorator(compressed);

        Database db = new CompressionDecorator(new EncryptionDecorator(database));

        String expected = "Base - decrypted - decompressed";

        String value = db.read();

        assertEquals("if encrypted data source is used, it shd return base", expected, value);
    }

}
