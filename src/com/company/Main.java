package com.company;

public class Main {

    public static void main(String[] args) {
        Academy academy = new Academy();
        generateUserData(academy);

        for (int i = 0; i < academy.getPersons().size(); i++) {
            academy.getPersons().get(i).showData();
        }
    }

    private static void generateUserData(Academy academy) {
        academy.addPerson(new Student("LNU", "Ihor"));
        academy.addPerson(new Worker("Soft", "Nazariy"));
        academy.addPerson(new Student("Econom", "Yura"));
        academy.addPerson(new Worker("Avalon", "Ira"));
        academy.addPerson(new Worker("Avalon", "Maria"));
        academy.addPerson(new Worker("Avalon", "Vika"));
        academy.addPerson(new Worker("Avalon", "Vikaa"));
    }
}
