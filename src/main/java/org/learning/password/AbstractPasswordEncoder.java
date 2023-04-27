package org.learning.password;

import lombok.AllArgsConstructor;

@AllArgsConstructor
// Step1: Add abstract keyword to class declaration
public abstract class AbstractPasswordEncoder {
    // Step2: Add state
    private String publicKey;
    // final keyword will enforce no modification and will throw an error while trying to change
    static final String KEY_PREFIX = "PUBLIC";

    // Step3: Add method with implementation
    public String getPublicKey() {
        return publicKey;
    }

    // Step4: Declare methods w/o implementation as abstract
    public abstract String encode(String password);

    public static void printKeyPrefix() {
        System.out.println(KEY_PREFIX);
    }
}
