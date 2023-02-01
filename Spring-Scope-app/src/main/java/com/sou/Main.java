package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.comp.MyBean;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //IOC Container
	   ApplicationContext appcntx=new ClassPathXmlApplicationContext("cfg.xml");
       MyBean mb=(MyBean)appcntx.getBean("my");
       System.out.println(mb);
       MyBean mb1=(MyBean)appcntx.getBean("my");
       System.out.println(mb1);
	}

}
