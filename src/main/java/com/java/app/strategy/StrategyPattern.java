package com.java.app.strategy;

import java.util.HashMap;
import java.util.Map;

import com.java.app.DesignPattern;

public class StrategyPattern implements DesignPattern{
    public void run() {
        Client client = new Client();
        Map data = new HashMap<>();

        // data.put("key", "7854-4548-4578-5487");
        // client.configure(new DebitCardPaymentStrategy(),data);

        // data.put("key", "4568-8745-4578-5487");
        // client.configure(new CreditCardPaymentStrategy(),data);

        data.put("key", "user:aaa#pass:564");
        client.configure(new NetBankingPaymentStrategy(),data);


        client.executeClientCode();
    }
}
