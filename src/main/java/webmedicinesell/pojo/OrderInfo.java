package webmedicinesell.pojo;

public class OrderInfo {

    private int orderId;
    private UserInfo userInfo;
    private DrugInfo drugInfo;
    private double orderPrice;
    private String orderTime;

    public OrderInfo() {
    }

    public OrderInfo(int orderId, UserInfo userInfo, DrugInfo drugInfo, double orderPrice, String orderTime) {
        this.orderId = orderId;
        this.userInfo = userInfo;
        this.drugInfo = drugInfo;
        this.orderPrice = orderPrice;
        this.orderTime = orderTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public DrugInfo getDrugInfo() {
        return drugInfo;
    }

    public void setDrugInfo(DrugInfo drugInfo) {
        this.drugInfo = drugInfo;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
}
