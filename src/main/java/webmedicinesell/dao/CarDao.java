package webmedicinesell.dao;

import webmedicinesell.pojo.CarInfo;

import java.util.List;

public interface CarDao {

    List<CarInfo> findAll();

    CarInfo findCar();

    int addCar(CarInfo carInfo);

    int updateCar(CarInfo carInfo);

    int deleteCar(CarInfo carInfo);
}
