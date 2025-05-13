package level02.exercise01.application;

import level02.exercise01.data.PersonsData;
import level02.exercise01.model.Person;

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

    public void addPersons() {
        persons = PersonsData.loadPersons();
    }

    public Person getPerson(int index) {
        return persons.get(index);
    }
}
