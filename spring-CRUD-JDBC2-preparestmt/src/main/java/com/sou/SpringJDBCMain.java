package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.model.Car;
import com.sou.service.CarService;
import com.sou.service.CarServiceImpl;

public class SpringJDBCMain {

	public static void main(String[] args) {
		ApplicationContext contxt=new ClassPathXmlApplicationContext("cfg.xml");
		CarService carservice=(CarService)contxt.getBean(CarServiceImpl.class);
		Car car=new Car("ab","ab1",90.67f);
		carservice.add(car);
		System.out.println("Done");

	}

}
