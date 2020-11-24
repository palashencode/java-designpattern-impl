package com.java.app.abstract_factory;

import com.java.app.DesignPattern;
import com.java.app.abstract_factory.factories.GUIFactory;
import com.java.app.abstract_factory.html.HTMLFactory;
import com.java.app.abstract_factory.mac.MACFactory;
import com.java.app.abstract_factory.win.WINFactory;

public class AbstractFactoryPattern implements DesignPattern{

    @Override
    public void run() {
        System.out.println("Abstract Factory Design Pattern");
        System.out.println("===============================");

        String gui = "html";
        // String gui = "win";
        // String gui = "mac";
        
        GUIFactory factory = null;

        if(gui.equals("html"))
            factory = new HTMLFactory();
        
        if(gui.equals("win"))
            factory = new WINFactory();
        
        if(gui.equals("mac"))
            factory = new MACFactory();

        
        /*
        * At run time we can re-configure the factory
        * and the client code remains unchanged,
        * still having the ability to create the new 
        * elements for the new factory.
        */    
        Client client = new Client(factory);
        client.executeClientCode();

    }
    
}
