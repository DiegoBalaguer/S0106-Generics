package level02.exercise01.model;

/**
 * PROGRAM: GenericMethods
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class GenericMethods {
    public static <T, U, V> void showThreeValues(T valueA, U valueB, int valueC) {
        System.out.println("Value a = " + valueA + " || Value b = " + valueB + " || Value c = " + valueC);
    }
}
