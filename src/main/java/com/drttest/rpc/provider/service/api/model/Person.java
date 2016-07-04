package com.drttest.rpc.provider.service.api.model;

import java.io.Serializable;

/**
 * Created by duruitao on 16/7/1.
 *
 * 注意：person 必须实现 Serializable 接口
 */
public class Person implements Serializable{

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
