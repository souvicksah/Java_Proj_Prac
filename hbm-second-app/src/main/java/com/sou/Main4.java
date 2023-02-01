package com.sou;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sou.model.Employee;

public class Main4 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		SessionFactory sf = cfg.buildSessionFactory(ssr);
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Employee emp = (Employee)s.get(Employee.class, 101);//to get the data both get and load method 
		//both get and load fetch the data from the database but get does not throw exception if record is not present
		//where as load throws exception if data is not there
		System.out.println(emp);
		t.commit();
		s.close();
		sf.close();
		System.out.println("done");

	}

}
