package level02.exercise02.application;

import level02.exercise02.model.GenericMethods;

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

        System.out.println(System.lineSeparator() + "* show interation 01 (4 elements)...........");
        GenericMethods.showValues(
                applicationWorkers.getPerson(0),
                applicationWorkers.getPerson(1),
                applicationWorkers.getPerson(2),
                applicationWorkers.getPerson(3));

        System.out.println(System.lineSeparator() + "* show interation 02 (8 elements)...........");
        GenericMethods.showValues(
                applicationWorkers.getPerson(0),
                applicationWorkers.getPerson(1),
                applicationWorkers.getPerson(2),
                applicationWorkers.getPerson(3),
                applicationWorkers.getPerson(0),
                applicationWorkers.getPerson(1),
                applicationWorkers.getPerson(2),
                applicationWorkers.getPerson(3));

        System.out.println("✅ process completed correctly");
    }
}
