package level01.exercise02.model;

/**
 * PROGRAM: GenericMethods
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class GenericMethods {
    public static <T, U, V> void showThreeValues(T valueA, U valueB, V valueC) {
        System.out.println("Value a = " + valueA + System.lineSeparator() +
                           "Value b = " + valueB + System.lineSeparator() +
                           "Value c = " + valueC);
    }
}
