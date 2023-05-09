package org.learning.design.button;

// Step 2 - concrete button classes
public class RoundButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Round button is clicked");
    }

    @Override
    public void render() {

    }
}
