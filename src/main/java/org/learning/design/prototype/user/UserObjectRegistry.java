package org.learning.design.prototype.user;

import java.util.HashMap;
import java.util.Map;

public class UserObjectRegistry {
    private Map<UserObjectType, UserObject> registry = new HashMap<>();

    public void store(UserObject user, UserObjectType type) {
        registry.put(type, user);
    }

    public UserObject get(UserObjectType type) {
        return registry.get(type);
    }
}
