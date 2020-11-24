package com.java.app.strategy;

import java.util.Map;

public class CreditCardPaymentStrategy implements Strategy{

    @Override
    public void execute(Map data) {
        System.out.println("Payment processed with : Credit Card:"+data.get("key"));
    }
    
}

