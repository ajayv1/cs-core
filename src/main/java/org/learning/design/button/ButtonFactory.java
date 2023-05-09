package org.learning.design.button;

// Step 3 - create factory classes
public class ButtonFactory {
    // Step 4 - create a static factory method
    // Requirements -
    //  - Accept a parameter
    //  - return a product interface
    public static Button createButton(Platform platform) {
        return switch (platform) {
            case IOS -> new LinkButton();
            case ANDROID -> new RoundButton();
            case WEB -> new PrimaryButton();
        };
    }
}
