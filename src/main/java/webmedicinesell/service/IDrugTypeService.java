package webmedicinesell.service;

import webmedicinesell.pojo.DrugTypeInfo;

import java.util.List;

public interface IDrugTypeService {

    List<DrugTypeInfo> findAll();

    DrugTypeInfo findDrugType(DrugTypeInfo drugTypeInfo);

    boolean addDrugType(DrugTypeInfo drugTypeInfo);

    boolean updateDrugType(DrugTypeInfo drugTypeInfo);

    boolean deleteDrugType(DrugTypeInfo drugTypeInfo);
}
