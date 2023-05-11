package org.learning.design.button.simplefactory;

import lombok.Getter;

@Getter
public class RoundButtonStore {
    private String id;
    private int radius;

    private RoundButtonStore() {}

    public static class RountButtonStoreBuilder{}

}
