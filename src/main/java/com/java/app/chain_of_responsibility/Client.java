package com.java.app.chain_of_responsibility;

public class Client {
    
    public void executeClientCode(){

        //Setting up the first chain object
        Handler dispenser = new Dispense1000Handler();

        // Setting up the dispenser chain
        dispenser.setNextHandler(new Dispense500Handler())
                 .setNextHandler(new Dispense100Handler())
                 .setNextHandler(new Dispense10Handler());
                                        
        dispenser.printChain();

        dispenser.process(new Currency(6989));
        
    }
}
