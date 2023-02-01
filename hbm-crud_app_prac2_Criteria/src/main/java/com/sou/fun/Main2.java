package com.sou.fun;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sou.cdac.Faculty;

public class Main2 {

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
	     Faculty f=new Faculty(6,"Nesha","Weed",new Date());
	     s.update(f);
		t.commit();
		s.close();
		sf.close();

	}

}
