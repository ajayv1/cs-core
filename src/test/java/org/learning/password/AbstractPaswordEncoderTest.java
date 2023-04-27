package org.learning.password;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractPaswordEncoderTest {
    @Test
    public void testEncoder() {
        AbstractPasswordEncoder encoder = new SubStringEncoder("abcde");
        String encoded = encoder.encode("abc");

        String expected = "ababcde";

        assertEquals("if abstract encoder is called, it shd return the string + key", expected, encoded);
    }

    @Test
    public void testStatic() {
        // System.out.println(AbstractPasswordEncoder.KEY_PREFIX); // PUBLIC
        /*
        AbstractPasswordEncoder encoder1 = new SubStringEncoder("abcde");
        encoder1.KEY_PREFIX = "PUBLIC_01";

        AbstractPasswordEncoder encoder2 = new SubStringEncoder("abcde");
        encoder2.KEY_PREFIX = "PUBLIC_02";

        // static variable belong to the class not to instance so changing it for one class will change for all instances.
        System.out.println(encoder1.KEY_PREFIX + " " + encoder2.KEY_PREFIX); // "PUBLIC_02 PUBLIC_02"
        */
        AbstractPasswordEncoder.printKeyPrefix();
    }
}
