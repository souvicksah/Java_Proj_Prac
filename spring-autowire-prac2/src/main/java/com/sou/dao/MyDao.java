package com.sou.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	public MyDao() {
		System.out.println("no arg MyDao is called");
	}
public void save() {
	System.out.println("Save Called");
}
}
