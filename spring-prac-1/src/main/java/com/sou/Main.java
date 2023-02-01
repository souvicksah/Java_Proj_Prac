package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.model.MyBean;

public class Main {

	public static void main(String[] args) {
	  ApplicationContext contxt=new ClassPathXmlApplicationContext("cfg.xml");
      MyBean mb=(MyBean)contxt.getBean("my");
      System.out.println(mb.getMsg());
    		  
	}

}
