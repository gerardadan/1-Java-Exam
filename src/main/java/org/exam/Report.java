package org.exam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Report {
    List<Car> cars;

    public Report(List<Car> cars){
        this.cars = cars;
    }

    public void showCars() {
        for(Car car : cars) {
            car.getReport();
            System.out.println();
        }
    }

    public List<Car> filterCarByManufactureDate(List<Car> cars, Date filterDate) {
        return cars
                .stream()
                .filter(c -> c.getManufactureDate().after(filterDate))
                .toList();
    }
}
