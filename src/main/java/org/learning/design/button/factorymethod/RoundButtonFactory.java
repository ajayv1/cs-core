package org.learning.design.button.factorymethod;

import org.learning.design.button.models.Button;
import org.learning.design.button.models.RoundButton;

public class RoundButtonFactory implements GenericButtonFactory {
    @Override
    public Button createButton() {
        return new RoundButton(null);
    }
}
