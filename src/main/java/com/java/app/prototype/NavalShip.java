package com.java.app.prototype;

public class NavalShip extends Ship{
    public int cannonStrength;

    NavalShip(){}

    NavalShip(NavalShip ship){
        super(ship);
        if(ship != null){
            this.cannonStrength = ship.cannonStrength;
        }
    }

    @Override
    public Ship clone() {
        return new NavalShip(this);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null)
            return false;
        if(!(obj instanceof NavalShip) || !super.equals(obj))
            return false;
        NavalShip ship = (NavalShip)obj;    
        return this.cannonStrength == ship.cannonStrength;      
    }

    
}
