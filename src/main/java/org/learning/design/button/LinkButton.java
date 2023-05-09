package org.learning.design.button;

public class LinkButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Link button is clicked");
    }

    @Override
    public void render() {

    }
}
