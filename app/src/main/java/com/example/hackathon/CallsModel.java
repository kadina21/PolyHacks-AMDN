package com.example.hackathon;

public class CallsModel {

    private String Date;
    private boolean isScammer;
    private String callingPersonNumber;

    public CallsModel(String date, boolean isScammer, String callingPersonNumber) {
        Date = date;
        this.isScammer = isScammer;
        this.callingPersonNumber = callingPersonNumber;
    }
    //

    @Override
    public String toString() {
        return "CallsModel{" +
                "Date='" + Date + '\'' +
                ", isScammer=" + isScammer +
                ", callingPersonNumber='" + callingPersonNumber + '\'' +
                '}';
    }


    // Getters and setters

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public boolean isScammer() {
        return isScammer;
    }

    public void setScammer(boolean scammer) {
        isScammer = scammer;
    }

    public String getCallingPersonNumber() {
        return callingPersonNumber;
    }

    public void setCallingPersonNumber(String callingPersonNumber) {
        this.callingPersonNumber = callingPersonNumber;
    }
}
