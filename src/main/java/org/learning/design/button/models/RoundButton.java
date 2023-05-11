package org.learning.design.button.models;


// Step 2 - concrete button classes
public class RoundButton extends Button {
    public RoundButton(String id) {
        super(id);
    }

    @Override
    public void onClick() {
        System.out.println("Round button is clicked");
    }

    @Override
    public void render() {

    }
}
