package webmedicinesell.service;

import webmedicinesell.pojo.AdminInfo;

import java.util.List;

public interface IAdminService {

    boolean adminLogin(AdminInfo adminInfo);
    List<AdminInfo> findAll();
    AdminInfo findAdmin(AdminInfo adminInfo);
    boolean addAdmin(AdminInfo adminInfo);
    boolean updateAdmin(AdminInfo adminInfo);
    boolean deleteAdmin(AdminInfo adminInfo);
    List<AdminInfo> findAllAdminType();
}
