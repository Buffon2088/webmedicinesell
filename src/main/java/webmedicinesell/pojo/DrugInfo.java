package webmedicinesell.pojo;

public class DrugInfo {

    private int drugId;
    private String drugName;
    private String drugIntroduce;
    private int drugNum;
    private double drugPrice;
    private String drugState;
    private CompanyInfo companyInfo;
    private DrugTypeInfo drugTypeInfo;

    public DrugInfo() {
    }

    public DrugInfo(int drugId, String drugName, String drugIntroduce, int drugNum, double drugPrice, String drugState, CompanyInfo companyInfo, DrugTypeInfo drugTypeInfo) {
        this.drugId = drugId;
        this.drugName = drugName;
        this.drugIntroduce = drugIntroduce;
        this.drugNum = drugNum;
        this.drugPrice = drugPrice;
        this.drugState = drugState;
        this.companyInfo = companyInfo;
        this.drugTypeInfo = drugTypeInfo;
    }

    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getDrugIntroduce() {
        return drugIntroduce;
    }

    public void setDrugIntroduce(String drugIntroduce) {
        this.drugIntroduce = drugIntroduce;
    }

    public int getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(int drugNum) {
        this.drugNum = drugNum;
    }

    public double getDrugPrice() {
        return drugPrice;
    }

    public void setDrugPrice(double drugPrice) {
        this.drugPrice = drugPrice;
    }

    public String getDrugState() {
        return drugState;
    }

    public void setDrugState(String drugState) {
        this.drugState = drugState;
    }

    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }

    public DrugTypeInfo getDrugTypeInfo() {
        return drugTypeInfo;
    }

    public void setDrugTypeInfo(DrugTypeInfo drugTypeInfo) {
        this.drugTypeInfo = drugTypeInfo;
    }
}
