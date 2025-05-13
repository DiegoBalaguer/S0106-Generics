package level02.exercise02.data;

import level02.exercise02.model.Person;

import java.util.ArrayList;

public class PersonsData {

    public static ArrayList<Person> loadPersons() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Marie", "Curie", "Radio and polonio", 31));
        persons.add(new Person("Alan", "Turing", "Máquina de Turing", 24));
        persons.add(new Person("Isaac", "Peral", "Submarino Torpedero", 38));
        persons.add(new Person("Juan", "de la Cierva", "Autogiro C4", 27));
        return persons;
    }



}
