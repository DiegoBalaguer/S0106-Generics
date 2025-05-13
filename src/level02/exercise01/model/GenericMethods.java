package level02.exercise01.model;

/**
 * PROGRAM: GenericMethods
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class GenericMethods {
    public static <T, U> void showThreeValues(T valueA, U valueB, int valueC) {
        System.out.println("Value a = " + valueA + System.lineSeparator() +
                "Value b = " + valueB + System.lineSeparator() +
                "Value c = " + valueC);
    }
}
