package com.java.app.decorator;

import com.java.app.DesignPattern;

public class DecoratorPattern implements DesignPattern{

    @Override
    public void run(){

        System.out.println("DECORATOR PATTERN");
        System.out.println("=================");

        // creating basic object
        DataSource ds = new FileDataSource();

        // adding functionalities at runtime - decorating
        ds = new CompressDecorator(new EncryptDecorator(new MD5Decorator(ds)));
           
        // ds = new EncryptDecorator(new CompressDecorator(ds));
    
        Client client = new Client(ds);
        client.executeClientCode();
    }
}
