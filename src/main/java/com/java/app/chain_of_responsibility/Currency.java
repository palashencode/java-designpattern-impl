package com.java.app.chain_of_responsibility;

// Data Class
public class Currency {
    private int amount;

    Currency(int amount){
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
