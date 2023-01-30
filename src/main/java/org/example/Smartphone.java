package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {
    String model;
    String manufacturer;

    List<String> kontakts = new ArrayList<>();

    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public boolean startRadio() {
        return false;
    }

    @Override
    public boolean stopRadio() {
        return false;
    }
}
