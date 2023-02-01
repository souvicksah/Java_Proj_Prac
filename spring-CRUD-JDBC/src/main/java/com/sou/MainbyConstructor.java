package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.service.MyService;

class MainbyConstructor {

	public static void main(String[] args) {
    		ApplicationContext contxt=new ClassPathXmlApplicationContext("cfg.xml");
    		MyService mb=(MyService)contxt.getBean("serv");
    		mb.add();//fot this in cfg file autowire set as byType
	}

}
