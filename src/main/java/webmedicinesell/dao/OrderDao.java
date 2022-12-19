package webmedicinesell.dao;

import webmedicinesell.pojo.OrderInfo;

import java.util.List;

public interface OrderDao {

    List<OrderInfo> findAll();

    OrderInfo findOrder(OrderInfo orderInfo);

    int addOrder(OrderInfo orderInfo);

    int updateOrder(OrderInfo orderInfo);

    int deleteOrder(OrderInfo orderInfo);
}
