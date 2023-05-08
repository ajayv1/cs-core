package org.learning.design.prototype.user;

import java.util.HashMap;
import java.util.Map;

public class Registry<ENTITY, ENTITY_TYPE> {
    private Map<ENTITY_TYPE, ENTITY> registry = new HashMap<>();

    public void store(ENTITY user, ENTITY_TYPE type) {
        registry.put(type, user);
    }

    public ENTITY get(ENTITY_TYPE type) {
        return registry.get(type);
    }
}
