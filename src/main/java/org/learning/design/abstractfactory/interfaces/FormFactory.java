package org.learning.design.abstractfactory.interfaces;

import org.learning.design.abstractfactory.models.Button;
import org.learning.design.abstractfactory.models.Checkbox;

// Step 3 - Create an abstract factory interface
public interface FormFactory {

    // Step 3.5 - add factory methods for products
    Button createButton();
    Checkbox createCheckbox();
}

// example Families
// Form - Btn, checkbox, input
// Theme - dark, light, medium
// Database - database, ConnectionPool, driver
