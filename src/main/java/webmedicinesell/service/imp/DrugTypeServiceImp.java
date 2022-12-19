package webmedicinesell.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webmedicinesell.dao.DrugTypeDao;
import webmedicinesell.pojo.DrugTypeInfo;
import webmedicinesell.service.IDrugTypeService;

import java.util.List;

@Service
@Transactional
public class DrugTypeServiceImp implements IDrugTypeService {

    @Autowired
    private DrugTypeDao drugTypeDao;


    @Override
    public List<DrugTypeInfo> findAll() {
        return drugTypeDao.findAll();
    }

    @Override
    public DrugTypeInfo findDrugType(DrugTypeInfo drugTypeInfo) {
        return drugTypeDao.findDrugType(drugTypeInfo);
    }

    @Override
    public boolean addDrugType(DrugTypeInfo drugTypeInfo) {
        return drugTypeDao.addDrugType(drugTypeInfo)>0;
    }

    @Override
    public boolean updateDrugType(DrugTypeInfo drugTypeInfo) {
        return drugTypeDao.updateDrugType(drugTypeInfo)>0;
    }

    @Override
    public boolean deleteDrugType(DrugTypeInfo drugTypeInfo) {
        return drugTypeDao.deleteDrugType(drugTypeInfo)>0;
    }
}
