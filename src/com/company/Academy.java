package com.company;

import java.util.ArrayList;
import java.util.List;

class Academy {

    private List<Person> persons = new ArrayList<>();

    List<Person> getPersons() {
        return persons;
    }

    void addPerson(Person person) {
        if (persons.size() > 5) {
            throw new IllegalStateException("Accademy does not more add persons ");
        }
        persons.add(person);
    }


    public Person testAddPerson(Person person) {
        getPersons().add(person);
        return person;
    }

}
