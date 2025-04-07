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

        List<Car> cars = new ArrayList<>();
        cars.add(sportCar);
        cars.add(suv);
        cars.add(sedan);

        Report report = new Report(cars);
        report.showCars();
        List<Car> carsFiltered = report.filterCarByManufactureDate(cars, new Date("2012/01/01"));
    }
}