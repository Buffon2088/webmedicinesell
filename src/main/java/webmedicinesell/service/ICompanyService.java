package webmedicinesell.service;

import webmedicinesell.pojo.CompanyInfo;

import java.util.List;

public interface ICompanyService {

    List<CompanyInfo> findAll();

    CompanyInfo findCompany(CompanyInfo companyInfo);

    boolean addCompany(CompanyInfo companyInfo);

    boolean updateCompany(CompanyInfo companyInfo);

    boolean deleteCompany(CompanyInfo companyInfo);
}
