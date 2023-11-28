package com.practise.streamss;

import java.util.List;

public class Customers {
    private int custId;
    private String name;

    private String emailID;
    private List<String> phoneNumber;

    public Customers(int custId, String name, String emailID, List<String> phoneNumber) {
        this.custId = custId;
        this.name = name;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
