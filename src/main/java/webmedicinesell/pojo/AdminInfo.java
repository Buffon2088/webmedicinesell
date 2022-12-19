package webmedicinesell.pojo;




public class AdminInfo {

    private int adminId;
    private String adminName;
    private String adminLoginName;
    private String adminLoginPwd;

    private String adminKey;
    private String adminEmail;
    private String adminImg;

    private String adminTel;
    private String adminLevel;
    private String adminState;

    public AdminInfo() {
    }

    public AdminInfo(int adminId, String adminName, String adminLoginName, String adminLoginPwd, String adminKey, String adminEmail, String adminImg, String adminTel, String adminLevel, String adminState) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminLoginName = adminLoginName;
        this.adminLoginPwd = adminLoginPwd;
        this.adminKey = adminKey;
        this.adminEmail = adminEmail;
        this.adminImg = adminImg;
        this.adminTel = adminTel;
        this.adminLevel = adminLevel;
        this.adminState = adminState;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminLoginName() {
        return adminLoginName;
    }

    public void setAdminLoginName(String adminLoginName) {
        this.adminLoginName = adminLoginName;
    }

    public String getAdminLoginPwd() {
        return adminLoginPwd;
    }

    public void setAdminLoginPwd(String adminLoginPwd) {
        this.adminLoginPwd = adminLoginPwd;
    }

    public String getAdminKey() {
        return adminKey;
    }

    public void setAdminKey(String adminKey) {
        this.adminKey = adminKey;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    public String getAdminImg() {
        return adminImg;
    }

    public void setAdminImg(String adminImg) {
        this.adminImg = adminImg;
    }

    public String getAdminTel() {
        return adminTel;
    }

    public void setAdminTel(String adminTel) {
        this.adminTel = adminTel;
    }

    public String getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(String adminLevel) {
        this.adminLevel = adminLevel;
    }

    public String getAdminState() {
        return adminState;
    }

    public void setAdminState(String adminState) {
        this.adminState = adminState;
    }
}
