package org.learning.design.button.models;

public class LinkButton extends Button {
    public LinkButton(String id) {
        super(id);
    }

    @Override
    public void onClick() {
        System.out.println("Link button is clicked");
    }

    @Override
    public void render() {

    }
}
