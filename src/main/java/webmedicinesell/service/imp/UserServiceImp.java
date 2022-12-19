package webmedicinesell.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import webmedicinesell.dao.UserDao;
import webmedicinesell.pojo.UserInfo;
import webmedicinesell.service.IUserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements IUserService {

    @Autowired
    private UserDao userDao;


    @Override
    public boolean userLogin(UserInfo userInfo) {
        return userDao.findUser(userInfo)!=null?true:false;
    }

    @Override
    public List<UserInfo> findAll() {
        return userDao.findAll();
    }

    @Override
    public UserInfo findUser(UserInfo userInfo) {
        return userDao.findUser(userInfo);
    }

    @Override
    public boolean addUser(UserInfo userInfo) {
        return userDao.addUser(userInfo)>0;
    }

    @Override
    public boolean updateUser(UserInfo userInfo) {
        return userDao.updateUser(userInfo)>0;
    }

    @Override
    public boolean deleteUser(UserInfo userInfo) {
        return userDao.deleteUser(userInfo)>0;
    }
}
