package org.exam;

import java.util.ArrayList;
import java.util.List;

public class Concessionaire {
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    private List<Vehicle> vehicles;

    public Concessionaire() {
        this.vehicles = new ArrayList<>();
    }
}
