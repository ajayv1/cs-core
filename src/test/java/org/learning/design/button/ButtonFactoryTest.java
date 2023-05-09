package org.learning.design.button;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ButtonFactoryTest {
    @Test
    public void testButton() {
        // this is tightly coupled with concrete class,
        // if RoundButton class name changes, here we also need to make change.
        // bad design
        Button round = new RoundButton();
    }

    @Test
    public void testButtonFactory() {
        Button roundBtn = ButtonFactory.createButton(Platform.ANDROID);

        assertTrue("If platform is android, button should be round", roundBtn instanceof RoundButton);

        roundBtn.onClick();
    }
}
