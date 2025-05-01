package level03.exercise01.model;

/**
 * PROGRAM: Generic
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

import level03.exercise01.interfaces.Phone;

public class Generic {

    public <T extends Phone> void phoneAction(T device) {
        System.out.println(device.call());
    }

    public <T extends Smartphone> void smartphoneAction(T device) {
        System.out.println(device.call());
        System.out.println(device.takePhoto());
    }
}