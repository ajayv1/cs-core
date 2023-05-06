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
        private String fname;
        private String lname;
        private String email;
        private Integer rollNo;

        public StudentBuilder setFname(String fname) {
            this.fname = fname;
            return this;
        }

        public StudentBuilder setLname(String lname) {
            this.lname = lname;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setRollNo(Integer rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public NewStudent build() {
            NewStudent ss = new NewStudent();

            ss.fname = fname;
            ss.lname = lname;
            ss.email = email;
            ss.rollNo = rollNo;

            return ss;
        }
    }
}
