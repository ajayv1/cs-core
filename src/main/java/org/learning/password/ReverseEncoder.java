package org.learning.password;

public class ReverseEncoder implements PasswordEncoder {

    @Override
    public String encode(String password) {
        StringBuilder sb = new StringBuilder(password);
        return sb.reverse().toString();
    }
}
