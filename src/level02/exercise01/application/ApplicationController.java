package level02.exercise01.application;

import level02.exercise01.model.GenericMethods;

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

        System.out.println("* show interation 01..........." + System.lineSeparator());
        GenericMethods.showThreeValues(
                applicationWorkers.getPerson(0),
                "esto es un String",
                1234);

        System.out.println(System.lineSeparator() + "* show interation 02..........." + System.lineSeparator());
        GenericMethods.showThreeValues(
                "esto es un String",
                applicationWorkers.getPerson(0),
                1234);

        System.out.println("✅ process completed correctly");
    }
}
