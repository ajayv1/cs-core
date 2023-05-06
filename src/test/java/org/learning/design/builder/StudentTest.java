package org.learning.design.builder;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void testStudent() {
        Map<String, Object> hm = new HashMap<>();

        hm.put("fname", "Ajay");
        hm.put("lname", "Verma");
        hm.put("email", "ajayverma128@gmail.com");
        hm.put("rollNo", 1234);

        Student ss = new Student(hm);

        assertEquals("If name is set, on fetching it should be the same", "Ajay", ss.getFname());
    }

    @Test
    public void testNewStudent() {
        NewStudent.StudentBuilder builder = NewStudent.builder();

        builder
                .setFname("Aj")
                .setLname("Verma")
                .setEmail("abc@gmail.com")
                .setRollNo(123);

        NewStudent newSS = builder.build();
        assertEquals("If name is set, on fetching it should be the same", "Aj", newSS.getFname());
    }

}
