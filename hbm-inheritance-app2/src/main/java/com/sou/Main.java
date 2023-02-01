package com.sou;

import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.sou.model.Clerk;
import com.sou.model.Employee;
import com.sou.model.Manager;

public class Main {
    private static SessionFactory sf;
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(cfg.getProperties());
		StandardServiceRegistry ssr = ssrb.build();
		sf = cfg.buildSessionFactory(ssr);
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		//Employee emp=new Employee(103,"Subrata",90904.90f);
		Manager m=new Manager(106,"Tushar",9800.90f,1789.5f,1987.60f);
		
		Clerk c=new Clerk(105,"Subrata",19876.50f,19087.55f);
		
		s.save(m);
		s.save(c);
		//selectAll();
	     //selectbyorder();
		//selectwhere();
		//selectwhereor();
		//selectwhereBetween();
		//selectwhereLike();
		//selectMoreProp();
		//selectOneProp();
		//selectGroupfun();
		//selectGroupBy();
		t.commit();
		s.close();
		
		sf.close();
		System.out.println("done");

	}
    private static void selectAll() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectbyorder() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.addOrder(Order.asc("salary"));
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhere() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.add(Restrictions.eq("dept", "cs"));
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhereor() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.add(Restrictions.or(Restrictions.eq("dept", "cs"),Restrictions.eq("dept", "it")));
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhereBetween() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.add(Restrictions.between("salary", 9000.00f, 9025.0f));
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectwhereLike() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.add(Restrictions.like("name","tu%"));
    	List<Employee> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectMoreProp() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	ProjectionList pList=Projections.projectionList();
    	pList.add(Projections.property("name"));
    	pList.add(Projections.property("salary"));
    	q.setProjection(pList);
    	
    	List<Object[]> lst=q.list();
    	lst.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
    	t.commit();
    	s.close();
    }
    private static void selectOneProp() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.setProjection(Projections.property("name"));
    	List<String> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectGroupfun() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	q.setProjection(Projections.sum("salary"));
    	List<Double> lst=q.list();
    	lst.forEach(ele->System.out.println(ele));
    	t.commit();
    	s.close();
    }
    private static void selectGroupBy() {
    	Session s=sf.openSession();
    	Transaction t=s.beginTransaction();
    	Criteria q=s.createCriteria(Employee.class);
    	ProjectionList pList=Projections.projectionList();
        pList.add(Projections.groupProperty("dept"));
        pList.add(Projections.sum("salary"));
    	q.setProjection(pList);
    	List<Object[]> lst=q.list();
    	lst.forEach(ele->System.out.println(ele[0]+" "+ele[1]));
    	t.commit();
    	s.close();
    }
}
