package webmedicinesell.dao;

import webmedicinesell.pojo.AddressInfo;

import java.util.List;

public interface AddressDao {

    List<AddressDao> findAll();

    AddressInfo findAddress(AddressInfo addressInfo);

    int addAddress(AddressInfo addressInfo);

    int updateAddress(AddressInfo addressInfo);

    int deleteAddress(AddressInfo addressInfo);
}
