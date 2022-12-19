package webmedicinesell.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webmedicinesell.dao.CompanyDao;
import webmedicinesell.pojo.CompanyInfo;
import webmedicinesell.service.ICompanyService;

import java.util.List;

@Service
@Transactional
public class CompanyServiceImp implements ICompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<CompanyInfo> findAll() {
        return companyDao.findAll();
    }

    @Override
    public CompanyInfo findCompany(CompanyInfo companyInfo) {
        return companyDao.findCompany(companyInfo);
    }

    @Override
    public boolean addCompany(CompanyInfo companyInfo) {
        return companyDao.addCompany(companyInfo)>0;
    }

    @Override
    public boolean updateCompany(CompanyInfo companyInfo) {
        return companyDao.updateCompany(companyInfo)>0;
    }

    @Override
    public boolean deleteCompany(CompanyInfo companyInfo) {
        return companyDao.deleteCompany(companyInfo)>0;
    }
}
