package level03.exercise01.application;

import level03.exercise01.model.Generic;
import level03.exercise01.model.Smartphone;

/**
 * PROGRAM: ApplicationController
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class ApplicationController {

    public void run() {

        System.out.println("CREATING PHONE....");

        Smartphone smartphone = new Smartphone();
        Generic genericPhone = new Generic();

        // Solo puede llamar a call()
        genericPhone.phoneAction(smartphone);

        // Puede llamar a call() y takePhoto()
        genericPhone.smartphoneAction(smartphone);
    }
/**
 * ¿Es posible que el primer método invoque takePhoto()?
 *
 * No, no es posible. Esto se debe a que el tipo genérico está restringido por la interfaz Phone,
 * la cual únicamente define el método call(). Aunque el objeto que se le pase sea una instancia
 * de Smartphone, el compilador solo permite acceder a los métodos declarados en la interfaz Phone.
 * Por tanto, takePhoto() no está disponible en ese contexto.
 */
}
