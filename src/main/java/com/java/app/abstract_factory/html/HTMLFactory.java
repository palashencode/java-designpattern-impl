package com.java.app.abstract_factory.html;

import com.java.app.abstract_factory.factories.Button;
import com.java.app.abstract_factory.factories.CheckBox;
import com.java.app.abstract_factory.factories.GUIFactory;

public class HTMLFactory extends GUIFactory {

    @Override
    public Button createButton(String displayText) {
        return new HTMLButton(displayText);
    }

    @Override
    public CheckBox createCheckBox(String valueText, boolean value) {
        return new HTMLCheckBox(valueText, value);
    }
    
}
