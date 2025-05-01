package level03.exercise01.model;

import level03.exercise01.interfaces.*;

/**
 * PROGRAM: Smartphone
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class Smartphone implements Phone {

    public String takePhoto() {
        return "Taking photo with smartphone.";
    }

    @Override
    public String call() {
        return "Calling from smartphone...";
    }

    @Override
    public String toString() {
        return "Smartphone{} ";
    }
}
