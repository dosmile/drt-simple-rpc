package com.drttest.rpc.provider.service.api.model;

/**
 * Created by duruitao on 16/7/1.
 */
public class Person {

    public Person(String name) {
        this.name = name;
    }

    private String name;

    private String address;

    private String phoneNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
