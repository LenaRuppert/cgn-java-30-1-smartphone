package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Radio, GPS {
    String model;
    String manufacturer;

    List<String> contacts = new ArrayList<>();

    public Smartphone(){

    }

    public Smartphone(String model, String manufacturer, List<String> contacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = this.contacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio startet");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
