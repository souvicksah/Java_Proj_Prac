package com.sou;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sou.model.Employee;

public class Main {
    private static SessionFactory sf;
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		sf = cfg.buildSessionFactory(ssr);
		
		//selectAll();
		//selectbyorder();
		//selectwhere();
		//selectwhereor();
		//selectwhereBetween();
		//selectwhereLike();
		//selectMoreProp();
		//selectOneProp();
		//selectGroupfun();
		selectGroupBy();
		
		sf.close();
		System.out.println("done");

	}
    private static void selectAll() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("from Employee");
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectbyorder() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("from Employee order by id desc");
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhere() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("from Employee where dept=:dpt");
    	q.setString("dpt", "it");
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhereor() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("from Employee where dept=:dpt1 or dept=:dpt2");
    	q.setString("dpt1", "it");
    	q.setString("dpt2","cs");
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhereBetween() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("from Employee where salary between :sal1 and :sal2");
    	q.setFloat("sal1", 9010.0f);
    	q.setFloat("sal2",9025.0f);
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhereLike() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("from Employee where name like :ptrn");
    	q.setString("ptrn", "tu%");
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectMoreProp() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("select name,salary from Employee");
    	List<Object[]> lst=q.list();
    	lst.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
    	t.commit();
    	s.close();
    }
    private static void selectOneProp() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("select name from Employee");
    	List<String> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectGroupfun() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("select sum(salary) from Employee");
    	List<Double> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectGroupBy() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Query q=s.createQuery("select dept,sum(salary) from Employee group by dept");
    	List<Object[]> lst=q.list();
    	lst.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
    	t.commit();
    	s.close();
    }
}
