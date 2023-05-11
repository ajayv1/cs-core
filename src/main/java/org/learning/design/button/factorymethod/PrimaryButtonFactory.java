package org.learning.design.button.factorymethod;

import org.learning.design.button.models.Button;
import org.learning.design.button.models.PrimaryButton;

public class PrimaryButtonFactory implements GenericButtonFactory {

    @Override
    public Button createButton() {
        return new PrimaryButton(null);
    }
}
