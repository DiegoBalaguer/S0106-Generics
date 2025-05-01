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

        applicationWorkers.addPerson();

        GenericMethods.showValues(
                applicationWorkers.getPerson().getName(),
                applicationWorkers.getPerson().getSurname(),
                applicationWorkers.getPerson().getAge(),

                applicationWorkers.getPerson().getSurname(),
                applicationWorkers.getPerson().getName(),
                applicationWorkers.getPerson().getAge());

        System.out.println("✅ process completed correctly");
    }
}
