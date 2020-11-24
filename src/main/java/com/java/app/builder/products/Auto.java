package com.java.app.builder.products;

import com.java.app.builder.parts.CarType;
import com.java.app.builder.parts.Engine;
import com.java.app.builder.parts.GPSNavigator;
import com.java.app.builder.parts.StatComputer;
import com.java.app.builder.parts.Transmission;

public class Auto {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final StatComputer statComputer;
    private final GPSNavigator gpsNavigator;

    public Auto(CarType carType, int seats, Engine engine, Transmission transmission,
    StatComputer statComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.statComputer = statComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.statComputer != null) {
            info += "Stat Computer: Functional" + "\n";
        } else {
            info += "Stat Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
