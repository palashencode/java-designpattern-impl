package com.java.app.abstract_factory.html;

import com.java.app.abstract_factory.factories.CheckBox;

public class HTMLCheckBox extends CheckBox{

    public HTMLCheckBox(String valueText, boolean value) {
        super(valueText, value);
    }

    @Override
    public void render() {
        System.out.println("Painting HTMLCheckBox");
    }
    
}
