package com.sou.comp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //IOC Container 
	ApplicationContext appcntx=new ClassPathXmlApplicationContext("cfg.xml");
     //get bean object from IOC Container
	MyBean mb=(MyBean)appcntx.getBean("my");
     System.out.println(mb.getMsg());
	}

}
