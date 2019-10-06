package com.company;

public class Worker extends Person {
    private String workPlace;

    Worker(String workPlace, String name) {
        this.workPlace = workPlace;
        super.name = name;
    }

    @Override
    public void showData() {
        System.out.println(name + " " + workPlace);
    }
}
