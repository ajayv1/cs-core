package org.learning.design.button.models;

import lombok.AllArgsConstructor;

@AllArgsConstructor
// Stpe 1 - create product interface
public abstract class Button {
    private String id;
    public abstract void onClick();
    public abstract void render();
}
