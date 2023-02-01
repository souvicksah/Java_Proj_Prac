package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.service.MyService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //IOC Container
		ApplicationContext appcintx=new ClassPathXmlApplicationContext("cfg.xml");
		MyService ms=(MyService)appcintx.getBean("serv");
		ms.add();
	   
	}

}
