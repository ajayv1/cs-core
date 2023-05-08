package org.learning.design.prototype.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserObject implements UserObjectCloneable {
    private String fname;
    private String lname;
    private int id;
    private int phone;
    private UserObjectType type;

    @Override
    public UserObject clone() {
        return new UserObject(fname, lname, id, phone, type);
    }
}
