package com.java.app.abstract_factory.win;

import com.java.app.abstract_factory.factories.Button;
import com.java.app.abstract_factory.factories.CheckBox;
import com.java.app.abstract_factory.factories.GUIFactory;

public class WINFactory extends GUIFactory {

    @Override
    public Button createButton(String displayText) {
        return new WINButton(displayText);
    }

    @Override
    public CheckBox createCheckBox(String valueText, boolean value) {
        return new WINCheckBox(valueText, value);
    }
    
}
