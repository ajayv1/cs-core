package org.learning.design.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// Step 2 - create concrete classes
@AllArgsConstructor
@Getter
@Setter
public class BackgroundObject implements GraphicalObject {
    private int x;
    private int y;
    private int width;
    private int height;
    private BackgroundObjectType type;

    // Step 2.5 - implement the clone method
    @Override
    public BackgroundObject clone() {
        return new BackgroundObject(x, y, width, height, type);
    }
}
