package org.exam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Concessionaire concessionaire = new Concessionaire();
        Car sportCar = new SportCar("Seat", "Ibiza", FuelType.diesel, new Date("2010/11/01"), 200.00);
        Car suv = new SuvCar("Seat", "Ibiza", FuelType.diesel, new Date("2015/11/01"), DriveType.ForxFor);
        Car sedan = new SedanCar("Seat", "Ibiza", FuelType.diesel, new Date("2020/11/01"), 350);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(sportCar);
        vehicles.add(suv);
        vehicles.add(sedan);

        Report report = new Report(vehicles);
        report.showCars();
        List<Car> carsFiltered = report.filterCarByManufactureDate(vehicles, new Date("2012/01/01"));
    }
}