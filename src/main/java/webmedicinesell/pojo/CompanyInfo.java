package webmedicinesell.pojo;

public class CompanyInfo {

    private int companyId;
    private String companyName;
    private String companyIntroduce;

    public CompanyInfo() {
    }

    public CompanyInfo(int companyId, String companyName, String companyIntroduce) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyIntroduce = companyIntroduce;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyIntroduce() {
        return companyIntroduce;
    }

    public void setCompanyIntroduce(String companyIntroduce) {
        this.companyIntroduce = companyIntroduce;
    }
}
