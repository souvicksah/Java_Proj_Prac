package com.sou.fun;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Subqueries;

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
		SelectAll();
	    orderByName();
		
		sf.close();

	}
	private static void SelectAll() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	     SQLQuery q=s.createSQLQuery("select * from Faculty");
	     q.addEntity(Faculty.class);
	     List<Faculty> lst=q.list();
	     lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void orderByName() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    SQLQuery q=s.createSQLQuery("select name from Faculty");
	    //q.addEntity(Faculty.class);
	     List<String> lst=q.list();
	     lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}


}
