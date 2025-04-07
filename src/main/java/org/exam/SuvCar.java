package org.exam;

import java.util.Date;

public class SuvCar extends Car{
    private DriveType driveType;

    public SuvCar(String brand, String model, FuelType fuelType, Date manufactureDate, DriveType driveType) {
        super(brand, model, fuelType, manufactureDate);
        this.driveType = driveType;
    }

    @Override
    String getDescription() {
        return "The " + this.driveType.toString() + this.getBrand() + " " + this.getModel() +
                " is an SUV that isn't afraid to go off-road. " +
                "Perfect for outdoor adventures, challenging terrain, " +
                "and weekend getaways, it offers power and safety.";
    }

    @Override
    void getReport() {
        System.out.println(this.getBrand());
        System.out.println(this.getModel());
        System.out.println(this.getPotency());
        System.out.println(this.getFuelType());
        System.out.println(this.getManufactureDate());
        System.out.println(this.driveType);
    }
}
