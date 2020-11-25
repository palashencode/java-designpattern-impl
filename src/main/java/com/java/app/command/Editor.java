package com.java.app.command;

import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init(){
        JFrame frame = new JFrame("Test Editor(Command pattern)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);

        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlZ = new JButton("Ctrl+Z");

        Editor editor = this;

        ctrlC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("copy clicked.");
                executeCommand(new CopyCommand(editor));
            }
        });

        ctrlX.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("cut clicked.");
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("paste clicked.");
                executeCommand(new PasteCommand(editor));
            }
        });
        ctrlZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("undo clicked.");
                undo();
            }
        });

        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    private void executeCommand(Command command){
        if(command.execute()){
            history.push(command);
        }
    }

    private void undo(){
        if(history.isEmpty()) 
        return;

        Command command = history.pop();
        if(command != null){
            command.undo();
        }
    }
}
