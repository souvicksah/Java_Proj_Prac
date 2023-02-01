package com.sou.service;

import java.util.List;

import com.sou.model.Car;

public interface CarService {
	void add(Car car);
	void modify(Car car);
	void removeByID(int id);
	Car getByID(int id);
	List<Car> getAll();
	void upload(int id,String image);
}
