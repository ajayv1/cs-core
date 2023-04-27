package org.learning.password;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class PasswordEncoderTest {
    @Test
    public void testPasswordEncoder() {
        PasswordEncoder encoder = new ReverseEncoder();
        String encodedStr = encoder.encode("malayalam");

        assertEquals("if rev encoder is used, it shoyld reverse the string", "malayalam", encodedStr);
    }

    @Test
    public void testDefaultPasswordEncoder() {
        PasswordEncoder encoder = new DefaultEncoder();
        String encodedStr = encoder.encode("malayalam");

        assertEquals("if default encoder is used, it shoyld return the same string", "malayalam", encodedStr);
    }

    @Test
    public void testTwoInterfaces() {
        List<PasswordEncoder> encoders = List.of(new DefaultEncoder(), new ReverseEncoder());
        List<String> expected = List.of("malayalam", "malayalam");
        List<String> actual = new ArrayList<>();

        for (PasswordEncoder encoder: encoders) {
            actual.add(encoder.encode("malayalam"));
        }

        List<String> actualFromStream = encoders.stream()
                        .map(encoder -> encoder.encode("malayalam"))
                        .collect(Collectors.toList());

        assertEquals("if both encoders are called, it shoyld return the correct string", expected.toArray(), actual.toArray());
        assertEquals("if both encoders are called, it shoyld return the correct string", expected.toArray(), actualFromStream.toArray());

    }
}
