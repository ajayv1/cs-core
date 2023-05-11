package org.learning.design.abstractfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.learning.design.abstractfactory.interfaces.FormFactory;
import org.learning.design.abstractfactory.models.Button;
import org.learning.design.abstractfactory.models.Checkbox;
import org.learning.design.abstractfactory.models.LightButton;
import org.learning.design.abstractfactory.models.LightCheckbox;

import static org.junit.Assert.assertTrue;

public class FormFactoryTest {

    private FormFactory factory;

    @Before
    public void setUp() {
        factory = new LightFormFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testFormFactory() {
        Button lightBtn = factory.createButton();
        Checkbox lightCheckbox = factory.createCheckbox();

        assertTrue("btn should be light after created from lightform factory", lightBtn instanceof LightButton);
        assertTrue("checkbox should be light after created from lightform factory", lightCheckbox instanceof LightCheckbox);

    }
}
