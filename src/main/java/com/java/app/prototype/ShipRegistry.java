package com.java.app.prototype;

import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class ShipRegistry {
    
    private Map<String,Ship> shipRegistry;

    ShipRegistry(){
        this.shipRegistry = new HashMap<>();
    }

    public void addShipObject(String key, Ship ship){
        shipRegistry.put(key, ship);
    }

    public Ship getShipObject(String key){
        Ship ship = shipRegistry.get(key);
        if(ship == null)
            throw new IllegalArgumentException(key+" definition does not exist in ship registry");
            
        return ship.clone();       
    }
}
