package level02.exercise02.model;

/**
 * PROGRAM: GenericMethods
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class GenericMethods {
    @SafeVarargs
    public static <T> void showValues(T... args) {
        for (T elemento : args) {
            System.out.println("Elemento: " + elemento);
        }
    }
}
