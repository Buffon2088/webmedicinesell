package webmedicinesell.pojo;

public class AddressInfo {

    private int addressId;
    private String addressName;
    private UserInfo userInfo;
    private String addressState;

    public AddressInfo() {
    }

    public AddressInfo(int addressId, String addressName, UserInfo userInfo, String addressState) {
        this.addressId = addressId;
        this.addressName = addressName;
        this.userInfo = userInfo;
        this.addressState = addressState;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }
}
