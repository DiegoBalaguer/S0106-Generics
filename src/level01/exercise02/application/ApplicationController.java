package level01.exercise02.application;

import level01.exercise02.model.GenericMethods;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationController {
    ApplicationWorkers applicationWorkers = new ApplicationWorkers();

    public void run() {
        System.out.println("* CREATE GenericMethods..........." + System.lineSeparator());

        applicationWorkers.addPersons();

        System.out.println(System.lineSeparator() + "* show interation 01...........");
        GenericMethods.showThreeValues(
                applicationWorkers.getPerson(0),
                "esto es un String",
                1234);

        System.out.println(System.lineSeparator() + "* show interation 02...........");
        GenericMethods.showThreeValues(
                1234,
                applicationWorkers.getPerson(0),
                "esto es un String");

        System.out.println(System.lineSeparator() + "* show interation 03...........");
        GenericMethods.showThreeValues(
                "esto es un String",
                1234,
                applicationWorkers.getPerson(0));

        System.out.println(System.lineSeparator() + "* show interation 04...........");
        GenericMethods.showThreeValues(
                applicationWorkers.getPerson(1),
                applicationWorkers.getPerson(2),
                applicationWorkers.getPerson(3));

        System.out.println("✅ process completed correctly");
    }
}
