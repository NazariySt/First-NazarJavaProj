package com.company;

public class Student extends Person {
    private String education;

    Student(String education, String name) {
        this.education = education;
        super.name = name;
    }

    @Override
    public void showData() {
        System.out.println(name + " " + education);
    }
}
