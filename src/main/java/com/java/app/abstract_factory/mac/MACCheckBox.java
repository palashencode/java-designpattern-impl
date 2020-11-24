package com.java.app.abstract_factory.mac;

import com.java.app.abstract_factory.factories.CheckBox;

public class MACCheckBox extends CheckBox{
    public MACCheckBox(String valueText, boolean value) {
        super(valueText, value);
    }

    @Override
    public void render() {
        System.out.println("Painting MACCheckBox");
    }
}
