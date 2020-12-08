package com.java.app.bridge;

import com.java.app.bridge.device.Device;
import com.java.app.bridge.device.Radio;
import com.java.app.bridge.device.Tv;
import com.java.app.bridge.remote.AdvancedRemote;
import com.java.app.bridge.remote.BasicRemote;

public class Client {
    public void executeClientCode(){
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
