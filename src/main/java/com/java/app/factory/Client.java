package com.java.app.factory;

public class Client {
    
    Dialog dialog;
    
    private void configure(){
        // this.dialog = new HTMLDialog("HTMLDIALOG-NAME");
        this.dialog = new WindowDialog("WINDOWDIALOG-NAME");
    }
    
    Client(){
        configure();
    }

    public void executeClientCode(){
        this.dialog.runBusinessLogic();
        Button button = this.dialog.createButton();
        button.render();
        button.onClick();
      }

}
