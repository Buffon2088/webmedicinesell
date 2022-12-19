package webmedicinesell.dao;

import webmedicinesell.pojo.DrugTypeInfo;

import java.util.List;

public interface DrugTypeDao {

    List<DrugTypeInfo> findAll();

    DrugTypeInfo findDrugType(DrugTypeInfo drugTypeInfo);

    int addDrugType(DrugTypeInfo drugTypeInfo);

    int updateDrugType(DrugTypeInfo drugTypeInfo);

    int deleteDrugType(DrugTypeInfo drugTypeInfo);
}
