package org.exam;

import java.util.Date;

public class SedanCar extends Car {
    private double trunkCapacity;


    public SedanCar(String brand, String model, FuelType fuelType, Date manufactureDate, double trunkCapacity) {
        super(brand, model, fuelType, manufactureDate);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    String getDescription() {
        return "With its spacious " + trunkCapacity + " " +
                "boot and a design conceived for comfort, " +
                "the " + this.getBrand() + " " + this.getModel() +
                " is the ideal companion for family trips and stylish daily commutes.";
    }

    @Override
    void getReport() {
        System.out.println(this.getBrand());
        System.out.println(this.getModel());
        System.out.println(this.getPotency());
        System.out.println(this.getFuelType());
        System.out.println(this.getManufactureDate());
        System.out.println(this.trunkCapacity);
    }
}
