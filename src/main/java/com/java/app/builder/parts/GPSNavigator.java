package com.java.app.builder.parts;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "HSR, Bangalore";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
