package org.exam;

import java.util.Date;

public class SportCar extends Car implements Exportable{
    private double maxSpeed;

    public SportCar(String brand, String model, FuelType fuelType, Date manufactureDate, double maxSpeed) {
        super(brand, model, fuelType, manufactureDate);
        this.maxSpeed = maxSpeed;
    }

    @Override
    String getDescription() {
        return "Designed for those who live the road intensely: " +
                "the " + this.getBrand() + " " + this.getModel() +
                " reaches a maximum speed of " + this.maxSpeed + " km/h, " +
                "combining elegance and performance in every curve.";
    }

    @Override
    void getReport() {
        System.out.println(this.getBrand());
        System.out.println(this.getModel());
        System.out.println(this.getPotency());
        System.out.println(this.getFuelType());
        System.out.println(this.getManufactureDate());
        System.out.println(this.maxSpeed);
    }

    @Override
    public String getExportInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getBrand());
        sb.append(this.getModel());
        sb.append(this.getPotency());
        sb.append(this.getFuelType());
        sb.append(this.getManufactureDate());
        sb.append(this.maxSpeed);

        return sb.toString();
    }
}
