package org.learning.password;

public class SubStringEncoder extends AbstractPasswordEncoder {
    public SubStringEncoder(String publicKey) {
        super(publicKey);
    }
    @Override
    public String encode(String password) {
        return password.substring(0, 2) + getPublicKey();
    }
}
