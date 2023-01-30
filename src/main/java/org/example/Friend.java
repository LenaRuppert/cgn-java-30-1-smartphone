package org.example;

public class Friend extends Contact{
    private int phoneNumber;

    public Friend(){

    }

    public Friend(String name, int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                "name=" + getName() +
                '}';
    }
}
