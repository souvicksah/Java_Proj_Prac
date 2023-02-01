package com.sou.dao;

import java.util.List;

import com.sou.model.Car;

public interface CarDao {
void save(Car car);
void update(Car car);
void deleteById(int id);
Car selectById(int id);
List<Car> selectAll();

}
