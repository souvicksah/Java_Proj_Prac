package com.sou;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sou.comp.MyColl;


class Main {

	public static void main(String[] args) {
    		ApplicationContext contxt=new ClassPathXmlApplicationContext("cfg.xml");
    		MyColl myColl=(MyColl)contxt.getBean("coll");
	        for(String s:myColl.getMyArr())
	        	System.out.println(s);
	        System.out.println("================");
	        for(String s:myColl.getMyList())
	        	System.out.println(s);
	        System.out.println("================");
	        for(String s:myColl.getMySet())
	        	System.out.println(s);
	        System.out.println("================");
	        System.out.println(myColl.getMyMap());
	        System.out.println("================");
	        System.out.println(myColl.getMyProps());
	}

}
