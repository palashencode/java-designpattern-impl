package com.java.app.strategy;

import java.util.Map;

public class DebitCardPaymentStrategy implements Strategy{

    @Override
    public void execute(Map data) {
        System.out.println("Payment processed with : Debit Card:"+data.get("key"));

    }
    
}
