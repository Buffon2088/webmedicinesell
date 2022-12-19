package webmedicinesell.pojo;

public class CarInfo {

    private int carId;
    private int totalNum;
    private UserInfo userInfo;
    private DrugInfo drugInfo;

    public CarInfo() {
    }

    public CarInfo(int carId, int totalNum, UserInfo userInfo, DrugInfo drugInfo) {
        this.carId = carId;
        this.totalNum = totalNum;
        this.userInfo = userInfo;
        this.drugInfo = drugInfo;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(int totalNum) {
        this.totalNum = totalNum;
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
}
