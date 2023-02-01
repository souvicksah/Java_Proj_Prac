package com.sou.fun;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import com.sou.cdac.Faculty;

public class Main {

	private static SessionFactory sf;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb=new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr=ssrb.build();
		sf=cfg.buildSessionFactory(ssr);
		//SelectAll();
	     //orderByName();
		//selectWhere();
		//selectWhereor();
		//selectWhereAnd();
		//selectWhereBetween();
		//selectOneProp();
		//selectMoreProp();
		selectSubquery();
		
		sf.close();

	}
	private static void SelectAll() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	     org.hibernate.Query q=s.createQuery("from Faculty");
	     List<Faculty> lst=q.list();
	     lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void orderByName() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	     org.hibernate.Query q=s.createQuery("from Faculty order by name");
	     List<Faculty> lst=q.list();
	     lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhere() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    org.hibernate.Query q=s.createQuery("from Faculty where subject=:sbj");
	    q.setString("sbj", "Java");
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhereor() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    org.hibernate.Query q=s.createQuery("from Faculty where subject=:sbj1 or subject=:sbj2");
	    q.setString("sbj1", "Java");
	    q.setString("sbj2", "WBT");
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhereAnd() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    org.hibernate.Query q=s.createQuery("from Faculty where subject=:sbj1 and name=:name");
	    q.setString("sbj1", "Java");
	    q.setString("name", "vipul");
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhereBetween() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    org.hibernate.Query q=s.createQuery("from Faculty where id between :id1 and :id2");
	    q.setInteger("id1", 2);
	    q.setInteger("id2", 5);
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectOneProp() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    org.hibernate.Query q=s.createQuery("select name from Faculty");
	    List<String> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectMoreProp() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    org.hibernate.Query q=s.createQuery("select id,name from Faculty");
	    List<Object[]> list=q.list();
	    list.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
		t.commit();
		s.close();
	}
	private static void selectSubquery() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		org.hibernate.Query q = s.createQuery("from Faculty where id in (select id from Faculty where subject=:sbj1)");
		q.setString("sbj1", "Java");
		List<Faculty> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}

}
