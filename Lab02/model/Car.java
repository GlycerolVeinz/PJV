package model;

import java.util.UUID;

public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private UUID vinCode;
    private static int car_count = 0;

    public Car(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.vinCode = UUID.randomUUID();
        this.car_count += 1;
    }

    @Override
    public String toString() {
        return (" " + manufacturer + " " + model + " " + year + " " + vinCode + " ");
    }

    public static int getNumberOfExistingCars() {
        return car_count;
    }
    
}