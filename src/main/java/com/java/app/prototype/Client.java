package com.java.app.prototype;

public class Client {
    public void executeClientCode(){
        CargoShip cargoShip = new CargoShip();
        cargoShip.color = "Red";
        cargoShip.deckSpace = 200;
        cargoShip.hullMaterial = "iron";
        cargoShip.propellers = 2;
        cargoShip.cargoHold = 2000;

        NavalShip navalShip = new NavalShip();
        navalShip.color ="Grey";
        navalShip.deckSpace = 45;
        navalShip.hullMaterial = "iron-alloy";
        navalShip.propellers = 5;
        navalShip.cannonStrength = 6;

        // Creating a New Cargo Ship of Specific Type
        CargoShip newRedIronCargoShip = (CargoShip)cargoShip.clone();
        
        // Creating a New Naval Ship of Specific Type        
        NavalShip newGreyIronNavalShip = (NavalShip)navalShip.clone();

        ShipRegistry registry = new ShipRegistry();

        // using clone to make sure that the registry contains a completely new inaccesiible object
        registry.addShipObject("red-iron-cargoship", cargoShip.clone()); 
        registry.addShipObject("grey-6canon-navalship", navalShip.clone());

        // Retrieving a specific type of naval ship from Prototype Registry.
        NavalShip newGreyIronNavalShipTwo = (NavalShip)registry.getShipObject("grey-6canon-navalship");
    }
}
