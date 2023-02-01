package com.sou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sou.dao.CarDao;
import com.sou.model.Car;
@Service
public class CarServiceImpl implements CarService {
    @Autowired
	private CarDao cardao;
	@Override
	public void add(Car car) {
	
		cardao.save(car);
	}

	@Override
	public void modify(Car car) {
		// TODO Auto-generated method stub
		cardao.update(car);
	}

	@Override
	public void removeByID(int id) {
		// TODO Auto-generated method stub
		cardao.deleteById(id);
	}

	@Override
	public Car getByID(int id) {
		// TODO Auto-generated method stub
		return cardao.selectById(id);
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return cardao.selectAll();
	}

	@Override
	public void upload(int id, String image) {
		cardao.upload(id, image);
		
	}

}
