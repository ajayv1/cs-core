package org.learning.design.button.simplefactory;

import lombok.Getter;
import lombok.Setter;
import org.learning.design.button.models.Platform;

// Doubt - on how to use builder pattern with factory

@Getter
public class PrimaryButtonStore {
    private String id;
    private int width;
    private int length;
    private Platform type;

    private PrimaryButtonStore() {}

    public static ButtonStoreBuilder builder() {
        return new ButtonStoreBuilder();
    }

    @Setter
    public static class ButtonStoreBuilder {
        private PrimaryButtonStore bs;

        public ButtonStoreBuilder() {
            this.bs = new PrimaryButtonStore();
        }

        public ButtonStoreBuilder setId(String id) {
            bs.id = id;
            return this;
        }

        public ButtonStoreBuilder setLength(int length) {
            bs.length = length;
            return this;
        }

        public ButtonStoreBuilder setWidth(int width) {
            bs.width = width;
            return this;
        }

        public ButtonStoreBuilder setType(Platform platform) {
            bs.type = platform;
            return this;
        }

        public PrimaryButtonStore build() {
            PrimaryButtonStore bstore = new PrimaryButtonStore();

            bstore.id = bs.id;
            bstore.length = bs.length;
            bstore.width = bs.width;
            bstore.type = bs.type;

            return bstore;
        }
    }
}
