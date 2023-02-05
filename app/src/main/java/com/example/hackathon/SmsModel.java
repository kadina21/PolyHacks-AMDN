package com.example.hackathon;

public class SmsModel {
    private String Date;
    private boolean isScammer;
    private String sendingPersonNumber;
    private String content;

    // Constructors

    public SmsModel(String date, boolean isScammer, String sendingPersonNumber, String content) {
        Date = date;
        this.isScammer = isScammer;
        this.sendingPersonNumber = sendingPersonNumber;
        this.content = content;
    }

    public SmsModel() {
    }

    // toString()
    @Override
    public String toString() {
        return "SmsModel{" +
                "Date='" + Date + '\'' +
                ", isScammer=" + isScammer +
                ", sendingPersonNumber='" + sendingPersonNumber + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    // getters and setters

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

    public String getSendingPersonNumber() {
        return sendingPersonNumber;
    }

    public void setsendingPersonNumber(String sendingPersonNumber) {
        this.sendingPersonNumber = sendingPersonNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
