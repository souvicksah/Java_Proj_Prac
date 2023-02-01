package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.service.MyService;

class Main {

	public static void main(String[] args) {
    		ApplicationContext contxt=new ClassPathXmlApplicationContext("cfg.xml");
    		MyService mb=(MyService)contxt.getBean(MyService.class);
    		mb.add();//autowire set as byName
	}

}
