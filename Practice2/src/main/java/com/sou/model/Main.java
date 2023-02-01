package com.sou.model;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
        StandardServiceRegistry ssr=ssrb.build();
        SessionFactory sf=cfg.buildSessionFactory(ssr);
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Student st=new Student(6,"Subham","Shubham@gmail.com",new Date());
        s.save(st);
        t.commit();
        s.close();
        sf.close();
        
	
	}

}
