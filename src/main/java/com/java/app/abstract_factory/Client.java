package com.java.app.abstract_factory;

import com.java.app.abstract_factory.factories.GUIFactory;

public class Client {
    
    GUIFactory factory;

    Client(GUIFactory factory){
        this.factory = factory;
    }

    public void executeClientCode(){
        factory.createButton("Submit").render();
        factory.createCheckBox("Male",true).render();
    }
}
