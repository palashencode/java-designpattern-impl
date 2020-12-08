package com.java.app.template;

import com.java.app.DesignPattern;

public class TemplatePattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("TEMPLATE PATTERN");
        System.out.println("================");

        Client client = new Client();
        client.executeClientCode();

    }
    
}
