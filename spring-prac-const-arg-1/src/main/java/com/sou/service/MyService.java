package com.sou.service;

import com.sou.dao.MyDao;

public class MyService {
	private MyDao myDao;

	

	public MyService(MyDao mydao) {
		this.myDao=mydao;
		// TODO Auto-generated constructor stub
	}
	public MyDao getMyDao() {
		
		return myDao;
	}
	public void add() {
		System.out.println("Add method is called");
		myDao.save();
	}
}
