package org.learning.design.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
public class NewStudent {
    private String fname;
    private String lname;
    private String email;
    private Integer rollNo;

    private NewStudent() {}

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Setter
    public static class StudentBuilder {
        /*
        private String fname;
        private String lname;
        private String email;
        private Integer rollNo;
        */

        private NewStudent newSS;

        public StudentBuilder() {
            this.newSS = new NewStudent();
        }
        public StudentBuilder setFname(String fname) {
            newSS.fname = fname;
            return this;
        }

        public StudentBuilder setLname(String lname) {
            newSS.lname = lname;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            newSS.email = email;
            return this;
        }

        public StudentBuilder setRollNo(Integer rollNo) {
            newSS.rollNo = rollNo;
            return this;
        }

        public NewStudent build() {
            NewStudent ss = new NewStudent();

            ss.fname = newSS.fname;
            ss.lname = newSS.lname;
            ss.email = newSS.email;
            ss.rollNo = newSS.rollNo;

            return ss;
        }
    }
}
