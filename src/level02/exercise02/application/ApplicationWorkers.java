package level02.exercise02.application;

import level01.exercise02.model.Person;

import java.util.ArrayList;

/**
 * PROGRAM: AplicationWorkers
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {

    private ArrayList<Person> persons;

    public ApplicationWorkers() {
        persons = new ArrayList<>();
    }

    public void addPerson() {
        persons.add(new Person("Marie", "Curie", 42));
    }

    public Person getPerson() {
        return persons.get(0);
    }
}
