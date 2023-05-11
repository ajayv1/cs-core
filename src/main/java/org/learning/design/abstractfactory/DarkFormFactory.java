package org.learning.design.abstractfactory;

import org.learning.design.abstractfactory.interfaces.FormFactory;
import org.learning.design.abstractfactory.models.Button;
import org.learning.design.abstractfactory.models.Checkbox;
import org.learning.design.abstractfactory.models.DarkButton;
import org.learning.design.abstractfactory.models.DarkCheckbox;

// Step 4 - create concrete factories
public class DarkFormFactory implements FormFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
