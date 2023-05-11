package org.learning.abstractfactory;

import org.learning.abstractfactory.interfaces.FormFactory;
import org.learning.abstractfactory.models.Button;
import org.learning.abstractfactory.models.Checkbox;
import org.learning.abstractfactory.models.DarkButton;
import org.learning.abstractfactory.models.DarkCheckbox;

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
