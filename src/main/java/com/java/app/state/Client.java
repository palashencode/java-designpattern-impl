package com.java.app.state;

public class Client {
    public void executeClientCode(){
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
