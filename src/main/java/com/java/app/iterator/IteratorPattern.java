package com.java.app.iterator;

import com.java.app.DesignPattern;

public class IteratorPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("ITERATOR PATTERN");
        System.out.println("================");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
