package level01.exercise02.model;

/**
 * PROGRAM: Person
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class Person {
    private String name;
    private String surname;
    private String invention;
    private int age;


    public Person(String name, String surname, String invention, int age) {
        this.name = name;
        this.surname = surname;
        this.invention = invention;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInvention() {
        return invention;
    }

    public void setInvention(String invention) {
        this.invention = invention;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", invention='" + invention + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
