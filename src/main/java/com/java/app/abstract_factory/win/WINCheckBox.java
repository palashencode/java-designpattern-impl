package com.java.app.abstract_factory.win;

import com.java.app.abstract_factory.factories.CheckBox;

public class WINCheckBox extends CheckBox{
    
    public WINCheckBox(String valueText, boolean value) {
        super(valueText, value);
    }

    @Override
    public void render() {
        System.out.println("Painting WINCheckBox");
    }
}
