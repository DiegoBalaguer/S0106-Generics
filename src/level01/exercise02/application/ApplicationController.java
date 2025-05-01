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

        applicationWorkers.addPerson();

        GenericMethods.showThreeValues(
                applicationWorkers.getPerson().getName(),
                applicationWorkers.getPerson().getSurname(),
                applicationWorkers.getPerson().getAge());

        GenericMethods.showThreeValues(
                applicationWorkers.getPerson().getAge(),
                applicationWorkers.getPerson().getName(),
                applicationWorkers.getPerson().getSurname());

        GenericMethods.showThreeValues(
                applicationWorkers.getPerson().getSurname(),
                applicationWorkers.getPerson().getAge(),
                applicationWorkers.getPerson().getName());

        System.out.println("✅ process completed correctly");
    }
}
