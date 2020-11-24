package com.java.app.abstract_factory.mac;

import com.java.app.abstract_factory.factories.Button;
import com.java.app.abstract_factory.factories.CheckBox;
import com.java.app.abstract_factory.factories.GUIFactory;

public class MACFactory extends GUIFactory {

    @Override
    public Button createButton(String displayText) {
        return new MACButton(displayText);
    }

    @Override
    public CheckBox createCheckBox(String valueText, boolean value) {
        return new MACCheckBox(valueText, value);
    }
    
}
