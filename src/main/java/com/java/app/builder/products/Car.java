package com.java.app.builder.products;

import com.java.app.builder.parts.CarType;
import com.java.app.builder.parts.Engine;
import com.java.app.builder.parts.GPSNavigator;
import com.java.app.builder.parts.StatComputer;
import com.java.app.builder.parts.Transmission;

public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final StatComputer statComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(CarType carType, int seats, Engine engine, Transmission transmission,
    StatComputer statComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.statComputer = statComputer;
        if (this.statComputer != null) {
            this.statComputer.setCar(this);
        }
        this.gpsNavigator = gpsNavigator;
    }

    public CarType getCarType() {
        return carType;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public StatComputer getTripComputer() {
        return statComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
