package com.java.app.mediator.component;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import com.java.app.mediator.Note;

import com.java.app.mediator.Mediator;

public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}