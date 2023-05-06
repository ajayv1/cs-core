package org.learning.design.builder;

import lombok.Getter;

import java.util.Map;

@Getter

public class Student {
    private String fname;
    private String lname;
    private String email;
    private Integer rollNo;

    public Student(Map<String, Object> hm) {
        if (hm.containsKey("fname")) {
            this.fname = (String) hm.get("fname");
        }

        if (hm.containsKey("lname")) {
            this.lname = (String) hm.get("lname");
        }

        if (hm.containsKey("email")) {
            this.email = (String) hm.get("email");
        }

        if (hm.containsKey("rollNo")) {
            this.rollNo = (Integer) hm.get("rollNo");
        }
    }
}
