package org.learning.password;

public class DefaultEncoder implements PasswordEncoder{

    @Override
    public String encode(String password) {
        return password;
    }
}
