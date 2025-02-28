package models;

import java.util.Objects;

public class Student {
    private String fullName;
    private int age;
    private int group;
    private int course;
    private String email;

//    public Student(String fullName, int age, int group, int course, String email) {
//        this.fullName = fullName;
//        this.age = age;
//        this.group = group;
//        this.course = course;
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

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", group=" + group +
                ", course=" + course +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && group == student.group && course == student.course && Objects.equals(fullName, student.fullName) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, age, group, course, email);
    }
}
