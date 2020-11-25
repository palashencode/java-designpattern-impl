package com.java.app.chain_of_responsibility;

import com.java.app.DesignPattern;

public class ChainOfResponsibilityPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("Chain of Responsibility Pattern");
        System.out.println("===============================");

        Client client = new Client();
        client.executeClientCode();
    }
    
}
