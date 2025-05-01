package level03.exercise01.model;

/**
 * PROGRAM: Major
 * AUTHOR: Diego Balaguer
 * DATE: 30/04/2025
 */

public class Major {
    private String manufacturer;
    private String model;

    public Major(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String callPhoneNumber(String phoneNumber) {
        return "Calling phone number " + phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
