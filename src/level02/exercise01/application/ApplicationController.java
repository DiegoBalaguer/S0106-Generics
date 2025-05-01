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

        applicationWorkers.addPerson();

        GenericMethods.showThreeValues(
                applicationWorkers.getPerson().getName(),
                applicationWorkers.getPerson().getSurname(),
                applicationWorkers.getPerson().getAge());

        GenericMethods.showThreeValues(
                applicationWorkers.getPerson().getSurname(),
                applicationWorkers.getPerson().getName(),
                applicationWorkers.getPerson().getAge());

        System.out.println("✅ process completed correctly");
    }
}
