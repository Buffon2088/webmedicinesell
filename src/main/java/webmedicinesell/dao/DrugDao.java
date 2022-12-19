package webmedicinesell.dao;

import webmedicinesell.pojo.DrugInfo;

import java.util.List;

public interface DrugDao {

    List<DrugInfo> findAll(DrugInfo drugInfo);

    DrugInfo findDrug(DrugInfo drugInfo);

    int addDrug(DrugInfo drugInfo);

    int updateDrug(DrugInfo drugInfo);

    int deleteDrug(DrugInfo drugInfo);
}
