package com.java.app.prototype;

public class CargoShip extends Ship{

    public int cargoHold;

    public CargoShip(){

    }

    public CargoShip(CargoShip ship){
        super(ship);
        if(ship!= null){
            this.cargoHold = ship.cargoHold;
        }
    }

    @Override
    public Ship clone() {
        return new CargoShip(this);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(!(obj instanceof CargoShip) || !super.equals(obj))
            return false;

        CargoShip ship = (CargoShip) obj;
        return ship.cargoHold == this.cargoHold;
    }
    
}
