package level01.exercise01.application;

/**
 * PROGRAM: AplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationController {
    ApplicationWorkers applicationWorkers = new ApplicationWorkers();

    public void run() {
        System.out.println("* CREATE NoGenericMethods..........." + System.lineSeparator());

        applicationWorkers.addPersons();

        System.out.println("* SHOW NoGenericMethods..........." + System.lineSeparator());

        applicationWorkers.showListPersons();

        System.out.println("✅ process completed correctly");
    }
}
