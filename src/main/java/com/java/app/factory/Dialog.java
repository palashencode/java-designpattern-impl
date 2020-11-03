package com.java.app.factory;

// The parent factory class.
public abstract class Dialog {
  
    protected String name;

    Dialog(String name){
        this.name = name;
    }

    public abstract Button createButton();

    public void runBusinessLogic(){
        System.out.println(name+" is executing imp business logic for dialog");
        
    }
}
