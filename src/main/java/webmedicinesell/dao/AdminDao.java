package webmedicinesell.dao;

import webmedicinesell.pojo.AdminInfo;

import java.util.List;

public interface AdminDao {

    List<AdminInfo> findAll();

    AdminInfo findAdmin(AdminInfo adminInfo);

    int addAdmin(AdminInfo adminInfo);

    int updateAdmin(AdminInfo adminInfo);

    int deleteAdmin(AdminInfo adminInfo);

    List<AdminInfo> findAllAdminType();

}
