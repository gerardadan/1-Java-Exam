package org.exam;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarReport extends Report{
    List<Car> cars;

    public CarReport(List<Car> cars){
        super();
        this.cars = cars;
    }

    public List<Car> filterCarByManufactureDate(List<Car> cars, Date filterDate) {
        return cars
                .stream()
                .filter(c -> c.getManufactureDate().after(filterDate))
                .toList();
    }


    @Override
    void show() {
        for(Car car : cars) {
            car.getReport();
            System.out.println();
        }
    }
}
