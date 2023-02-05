package com.example.hackathon;

public class ScammerModel {
    private String phoneNumber;

    public ScammerModel(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ScammerModel() {
    }

    // toString()
    @Override
    public String toString() {
        return "ScammerModel{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    // Getters and setters

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
