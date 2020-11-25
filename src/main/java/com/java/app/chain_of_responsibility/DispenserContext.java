package com.java.app.chain_of_responsibility;

public class DispenserContext {
    Currency currency;
    
    DispenserContext(int amount){
        currency = new Currency(amount);
        }

}
