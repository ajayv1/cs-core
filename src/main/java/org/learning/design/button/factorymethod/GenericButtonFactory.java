package org.learning.design.button.factorymethod;

import org.learning.design.button.models.Button;

// Step 2 - create factory interface
public interface GenericButtonFactory {
    public Button createButton();
}
