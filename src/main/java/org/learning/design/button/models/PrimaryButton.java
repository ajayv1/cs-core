package org.learning.design.button.models;

public class PrimaryButton extends Button {
    public PrimaryButton(String id) {
        super(id);
    }

    @Override
    public void onClick() {
        System.out.println("Primary button is clicked");
    }

    @Override
    public void render() {

    }
}
