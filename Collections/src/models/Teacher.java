package models;

import java.util.Objects;

public class Teacher {
    private String fullName;
    private int age;
    private String subject;
    private String email;

//    public Teacher(String fullName, int age, String subject, String email) {
//        this.fullName = fullName;
//        this.age = age;
//        this.subject = subject;
//        this.email = email;
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return age == teacher.age && Objects.equals(fullName, teacher.fullName) && Objects.equals(subject, teacher.subject) && Objects.equals(email, teacher.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, subject, email);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
