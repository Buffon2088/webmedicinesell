package webmedicinesell.dao;

import webmedicinesell.pojo.CompanyInfo;

import java.util.List;

public interface CompanyDao {

    List<CompanyInfo> findAll();

    CompanyInfo findCompany(CompanyInfo companyInfo);

    int addCompany(CompanyInfo companyInfo);

    int updateCompany(CompanyInfo companyInfo);

    int deleteCompany(CompanyInfo companyInfo);
}
