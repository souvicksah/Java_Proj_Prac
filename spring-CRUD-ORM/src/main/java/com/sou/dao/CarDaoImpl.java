package com.sou.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sou.model.Car;
@Repository
public class CarDaoImpl implements CarDao {
     @Autowired
	private HibernateTemplate hibernateTemp;
	@Override
	public void save(Car car) {
		hibernateTemp.execute(session->{
			Transaction t=session.beginTransaction();
			session.save(car);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
		
	}

	@Override
	public void update(Car car) {
		// TODO Auto-generated method stub
		hibernateTemp.execute(session->{
			Transaction t=session.beginTransaction();
			session.update(car);
			t.commit();
			session.flush();
			session.close();
			return null;
		});
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		hibernateTemp.execute(session->{
			Transaction t=session.beginTransaction();
			session.delete(new Car(id));
			t.commit();
			session.flush();
			session.close();
			return null;
		});
		
	}

	@Override
	public Car selectById(int id) {
		// TODO Auto-generated method stub
		return hibernateTemp.execute(session->{
			Transaction t=session.beginTransaction();
			Car car=(Car)session.get(Car.class, id);
			t.commit();
			session.flush();
			session.close();
			return car;
		});
		
	}

	@Override
	public List<Car> selectAll() {
		// TODO Auto-generated method stub
		return hibernateTemp.execute(session->{
			Transaction t=session.beginTransaction();
			Query q=session.createQuery("from Car");
			List<Car> list=q.list();
			t.commit();
			session.flush();
			session.close();
			return list;
		});
	}

   

}
