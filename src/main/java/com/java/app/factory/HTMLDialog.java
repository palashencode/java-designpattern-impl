package com.java.app.factory;

public class HTMLDialog extends Dialog{

    HTMLDialog(String name) {
        super(name);
    }

    @Override
    public Button createButton() {
        return new HTMLButton();
    }
    
}
