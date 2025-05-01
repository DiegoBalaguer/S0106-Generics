package level01.exercise01.application;

import level01.exercise01.model.NoGenericMethods;

import java.util.ArrayList;

/**
 * PROGRAM: AplicationManager
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationWorkers {

    private ArrayList<NoGenericMethods> persons;

    public ApplicationWorkers() {
        persons = new ArrayList<>();
    }

    public void addPersons() {
        persons.add(new NoGenericMethods("Marie", "Curie", "MAR4R5I6E7"));
        persons.add(new NoGenericMethods("Curie", "MAR4R5I6E7", "Marie"));
        persons.add(new NoGenericMethods("MAR4R5I6E7", "Marie", "Curie"));
    }

    public void showListPersons() {
        for (NoGenericMethods person : persons) {
            System.out.println(person.toString());
        }
    }
}
