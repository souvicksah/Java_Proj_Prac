package com.sou.service;

import com.sou.dao.MyDao;

public class MyService {
private MyDao myDao;

public MyDao getMyDao() {
	return myDao;
}

public void setMyDao(MyDao myDao) {
	this.myDao = myDao;
	System.out.println("Setter method called");
}

public void add() {
	System.out.println("add() called");
	myDao.save();
}
}
