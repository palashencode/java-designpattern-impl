package com.java.app.factory;

public class WindowDialog extends Dialog{

    WindowDialog(String name) {
        super(name);
    }

    @Override
    public Button createButton() {
        return new WindowButton();
    }
    
}
