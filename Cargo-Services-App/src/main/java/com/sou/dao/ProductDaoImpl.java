package com.sou.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sou.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	@Autowired
	private HibernateTemplate hibernateTemp;
	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		hibernateTemp.execute(session->{
			Transaction t = session.beginTransaction();
			session.save(p);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
		
	}

	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		hibernateTemp.execute(session->{
			Transaction t = session.beginTransaction();
			session.update(p);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
		
	}

	@Override
	public void deleteByID(int id) {
		// TODO Auto-generated method stub
		hibernateTemp.execute(session->{
			Transaction t = session.beginTransaction();
			session.delete(new Product(id));
			t.commit();
			session.flush();
			session.close();
			return null;
		});
		
	}

	@Override
	public Product selectByID(int id) {
		return hibernateTemp.execute(session->{
			Transaction t = session.beginTransaction();
			Product p = (Product)session.get(Product.class, id);
			t.commit();
			session.flush();
			session.close();
			return p;
		});
	}

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		return hibernateTemp.execute(session->{
			Transaction t = session.beginTransaction();
			Query q = session.createQuery("from Product");
			List<Product> lst = q.list();
			t.commit();
			session.flush();
			session.close();
			return lst;
		});
	}

}
