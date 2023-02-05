package com.example.hackathon;

public class SignupModel {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private String trustNumber;
    private String trustName;
    private String trustRelationship;


    public SignupModel(String firstName, String lastName, String phoneNumber, String password, String trustNumber, String trustName, String trustRelationship){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.trustNumber = trustNumber;
        this.trustName = trustName;
        this.trustRelationship = trustRelationship;

    }

    // default contructor
    public SignupModel() {
    }
    // to string for printing the signup model

    @Override
    public String toString() {
        return "SignupModel{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", trustNumber='" + trustNumber + '\'' +
                ", trustName='" + trustName + '\'' +
                ", trustRelationship='" + trustRelationship + '\'' +
                '}';
    }

    // Getters and setters:

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTrustNumber() {
        return trustNumber;
    }

    public void setTrustNumber(String trustNumber) {
        this.trustNumber = trustNumber;
    }

    public String getTrustName() {
        return trustName;
    }

    public void setTrustName(String trustName) {
        this.trustName = trustName;
    }

    public String getTrustRelationship() {
        return trustRelationship;
    }

    public void setTrustRelationship(String trustRelationship) {
        this.trustRelationship = trustRelationship;
    }
}
