package com.java.app.visitor;

import com.java.app.DesignPattern;

public class VisitorPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("VISITOR PATTERN");
        System.out.println("===============");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
