package com.sou.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sou.dao.MyDao;
@Service
public class MyService {
	@Autowired
	private MyDao myDao;
   
	public MyService() {
	}
	public MyService(MyDao myDao) {
		this.myDao = myDao;
	}
	public MyDao getMyDao() {
		return myDao;
	}
    
	public void setMyDao(MyDao myDao) {
		System.out.println("Setter method is called");
		this.myDao = myDao;
	}
	public void add() {
		System.out.println("Add method is called");
		myDao.save();
	}
}
