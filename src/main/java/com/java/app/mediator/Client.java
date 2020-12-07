package com.java.app.mediator;

import javax.swing.DefaultListModel;

import com.java.app.mediator.component.AddButton;
import com.java.app.mediator.component.DeleteButton;
import com.java.app.mediator.component.Filter;
import com.java.app.mediator.component.List;
import com.java.app.mediator.component.SaveButton;
import com.java.app.mediator.component.TextBox;
import com.java.app.mediator.component.Title;

public class Client {
    public void executeCode(){
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
