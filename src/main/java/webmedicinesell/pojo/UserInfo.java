package webmedicinesell.pojo;

public class UserInfo {

    private int userId;
    private String userName;
    private String userLoginName;
    private String userLoginPwd;
    private double userBalance;
    private String userEmail;
    private String userKey;
    private String userTel;
    private String userImg;
    private String userState;

    public UserInfo() {
    }

    public UserInfo(int userId, String userName, String userLoginName, String userLoginPwd, double userBalance, String userEmail, String userKey, String userTel, String userImg, String userState) {
        this.userId = userId;
        this.userName = userName;
        this.userLoginName = userLoginName;
        this.userLoginPwd = userLoginPwd;
        this.userBalance = userBalance;
        this.userEmail = userEmail;
        this.userKey = userKey;
        this.userTel = userTel;
        this.userImg = userImg;
        this.userState = userState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLoginName() {
        return userLoginName;
    }

    public void setUserLoginName(String userLoginName) {
        this.userLoginName = userLoginName;
    }

    public String getUserLoginPwd() {
        return userLoginPwd;
    }

    public void setUserLoginPwd(String userLoginPwd) {
        this.userLoginPwd = userLoginPwd;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    public String getUserState() {
        return userState;
    }

    public void setUserState(String userState) {
        this.userState = userState;
    }
}
