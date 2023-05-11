package org.learning.design.button.simplefactory;

import org.learning.design.button.models.*;

// Step 3 - create factory classes
public class ButtonFactory {
    // Step 4 - create a static factory method
    // Requirements -
    //  - Accept a parameter
    //  - return a product interface

    public static Button createButton(Platform platform, String id) {
        return switch (platform) {
            case IOS -> new LinkButton(id);
            case ANDROID -> new RoundButton(id);
            case WEB -> new PrimaryButton(id);
        };
    }

    public static PrimaryButtonStore.ButtonStoreBuilder createButton() {
        return PrimaryButtonStore.builder();
    }
}
