package level01.exercise01.model;

/**
 * PROGRAM: NoGenericMethods
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class NoGenericMethods {
    private String name;
    private String surname;
    private String indentification;

    public NoGenericMethods(String name, String surname, String indentification) {
        this.name = name;
        this.surname = surname;
        this.indentification = indentification;
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

    public String getIndentification() {
        return indentification;
    }

    public void setIndentification(String indentification) {
        this.indentification = indentification;
    }

    @Override
    public String toString() {
        return "NoGenericMethods{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", indentification='" + indentification + '\'' +
                '}';
    }
}
