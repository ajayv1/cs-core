package org.learning.abstractfactory;

import org.learning.abstractfactory.interfaces.FormFactory;
import org.learning.abstractfactory.models.Button;
import org.learning.abstractfactory.models.Checkbox;
import org.learning.abstractfactory.models.LightButton;
import org.learning.abstractfactory.models.LightCheckbox;

// Step 4 - create concrete factories
public class LightFormFactory implements FormFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
