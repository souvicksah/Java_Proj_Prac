package com.sou.service;

import com.sou.dao.MyDao;

public class MyService {
	private MyDao myDao;

	public MyDao getMyDao() {
		return myDao;
	}
    
	public MyService(MyDao myDao) {
		this.myDao = myDao;
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
