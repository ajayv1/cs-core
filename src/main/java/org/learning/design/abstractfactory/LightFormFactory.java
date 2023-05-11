package org.learning.design.abstractfactory;

import org.learning.design.abstractfactory.interfaces.FormFactory;
import org.learning.design.abstractfactory.models.Button;
import org.learning.design.abstractfactory.models.Checkbox;
import org.learning.design.abstractfactory.models.LightButton;
import org.learning.design.abstractfactory.models.LightCheckbox;

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
