package org.learning.design.button.factorymethod;

import org.learning.design.button.models.Button;
import org.learning.design.button.models.LinkButton;

public class LinkButtonFactory implements GenericButtonFactory {
    @Override
    public Button createButton() {
        return new LinkButton(null);
    }
}
