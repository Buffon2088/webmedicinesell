package webmedicinesell.pojo;

public class DrugTypeInfo {

    private int drugTypeId;
    private String drugTypeName;
    private String drugTypeState;

    public DrugTypeInfo() {
    }

    public DrugTypeInfo(int drugTypeId, String drugTypeName, String drugTypeState) {
        this.drugTypeId = drugTypeId;
        this.drugTypeName = drugTypeName;
        this.drugTypeState = drugTypeState;
    }

    public int getDrugTypeId() {
        return drugTypeId;
    }

    public void setDrugTypeId(int drugTypeId) {
        this.drugTypeId = drugTypeId;
    }

    public String getDrugTypeName() {
        return drugTypeName;
    }

    public void setDrugTypeName(String drugTypeName) {
        this.drugTypeName = drugTypeName;
    }

    public String getDrugTypeState() {
        return drugTypeState;
    }

    public void setDrugTypeState(String drugTypeState) {
        this.drugTypeState = drugTypeState;
    }
}
