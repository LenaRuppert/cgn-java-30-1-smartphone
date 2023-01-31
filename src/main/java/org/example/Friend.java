package org.example;

public class Friend extends Contact {
    private String phoneNumber;

    public Friend() {

    }

    public Friend(String name, String phoneNumber) {

        this.phoneNumber = phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;


    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber=" + phoneNumber +
                "name=" + getName() +
                '}';
    }
}
