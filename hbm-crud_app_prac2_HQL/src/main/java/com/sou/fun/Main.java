package com.sou.fun;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
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
	     Criteria q=s.createCriteria(Faculty.class);
	     List<Faculty> lst=q.list();
	     lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void orderByName() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Criteria q=s.createCriteria(Faculty.class);
	    q.addOrder(Order.desc("name"));
	     List<Faculty> lst=q.list();
	     lst.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhere() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Criteria q=s.createCriteria(Faculty.class);
	    q.add(Restrictions.eq("subject","Java"));
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhereor() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Criteria q=s.createCriteria(Faculty.class);
	    q.add(Restrictions.or(Restrictions.eq("subject", "java"),Restrictions.eq("subject","WBT")));
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhereAnd() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	     Criteria q=s.createCriteria(Faculty.class);
	     q.add(Restrictions.and(Restrictions.eq("subject","java"),Restrictions.eq("name","vipul")));
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectWhereBetween() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Criteria q=s.createCriteria(Faculty.class);
	    q.add(Restrictions.between("id", 2, 4));
	    List<Faculty> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectOneProp() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Criteria q=s.createCriteria(Faculty.class);
	    q.setProjection(Projections.property("name"));
	    List<String> list=q.list();
	    list.forEach(ele->System.out.println(ele));
		t.commit();
		s.close();
	}
	private static void selectMoreProp() {
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
	    Criteria q=s.createCriteria(Faculty.class);
	    ProjectionList plist=Projections.projectionList();
	    plist.add(Projections.property("id"));
	    plist.add(Projections.property("name"));
	    q.setProjection(plist);
	    List<Object[]> list=q.list();
	    list.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
		t.commit();
		s.close();
	}
	private static void selectSubquery() {
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		
		DetachedCriteria dc=DetachedCriteria.forClass(Faculty.class);
		dc.setProjection(Projections.property("id"));
		dc.add(Restrictions.eq("id", 2));
		
		Criteria q=s.createCriteria(Faculty.class);
		q.add(Subqueries.propertyEq("id", dc));
		
		List<Faculty> lst = q.list();
		lst.forEach(ele->System.out.println(ele)); 
		t.commit();
		s.close();
	}

}
