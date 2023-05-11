package org.learning.design.button;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.learning.design.button.factorymethod.GenericButtonFactory;
import org.learning.design.button.factorymethod.PrimaryButtonFactory;
import org.learning.design.button.models.Button;
import org.learning.design.button.models.Platform;
import org.learning.design.button.models.PrimaryButton;
import org.learning.design.button.models.RoundButton;
import org.learning.design.button.simplefactory.ButtonFactory;
import org.learning.design.button.simplefactory.PrimaryButtonStore;

import static org.junit.Assert.assertTrue;

public class ButtonFactoryTest {

    private GenericButtonFactory factory;

    @Before
    public void setUp() {
        factory = new PrimaryButtonFactory();
    }

    @After
    public void tearDown() {
        factory = null;
    }

    @Test
    public void testButton() {
        // this is tightly coupled with concrete class,
        // if RoundButton class name changes, here we also need to make change.
        // bad design
        Button round = new RoundButton("1");
    }

    @Test
    public void testButtonSimpleFactory() {
        Button roundBtn = ButtonFactory.createButton(Platform.ANDROID, "1");

        assertTrue("If platform is android, button should be round", roundBtn instanceof RoundButton);

        roundBtn.onClick();
    }

    @Test
    public void testButtonSimpleFactoryWithBuilder() {
        PrimaryButtonStore.ButtonStoreBuilder buttonStoreBuilder = ButtonFactory.createButton();
        buttonStoreBuilder.setType(Platform.ANDROID).setId("1").build();

        // doubt on how to create instance of button
    }

    @Test
    public void testButtonFactoryMethod() {
        Button primaryBtn = factory.createButton();

        assertTrue("from primary btn factory, button should be primary", primaryBtn instanceof PrimaryButton);


    }
}
