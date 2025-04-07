package org.exam;

import java.util.Date;

public abstract class Car extends Vehicle{
    private String model;
    private int potency;
    private String brand;
    private FuelType fuelType;
    private Date manufactureDate;

    public Car(String brand, String model, FuelType fuelType, Date manufactureDate) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.manufactureDate = manufactureDate;
    }

    abstract String getDescription();
    abstract void getReport();

    public String getModel() {
        return model;
    }

    public int getPotency() {
        return potency;
    }

    public String getBrand() {
        return brand;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }
}
