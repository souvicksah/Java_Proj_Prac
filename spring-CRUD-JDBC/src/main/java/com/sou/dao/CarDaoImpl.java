package com.sou.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sou.model.Car;
@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
	private JdbcTemplate jdbctemp;
	
	public void save(Car car) {
		jdbctemp.update("insert into Car(make,model,price) values('"+car.getMake()+"','"+car.getModel()+"',"+car.getPrice()+")");
            		
	}

	public void update(Car car) {
	   	
		jdbctemp.update("update Car set make='"+car.getMake()+"',model='"+car.getModel()+"',price="+car.getPrice()+"where id="+car.getId()+")");
	}

	public void deleteById(int id) {
       		
		jdbctemp.update("delete from Car where id="+id);
	}

	public List<Car> selectAll() {
		
		return jdbctemp.query("select * from Car", rs->{
			List<Car> list=new ArrayList<>();
			while(rs.next()) {
				Car car=new Car();
				car.setId(rs.getInt(1));
	    		 car.setMake(rs.getString(2));
	    		 car.setModel(rs.getString(3));
	    		 car.setPrice(rs.getFloat(4));
	    		 list.add(car);
			}
			return list;
		});
	}

	public Car selectById(int id) {
	     jdbctemp.query("select * from Car where id="+id,rs->{
	    	 Car car=new Car();
	    	 if(rs.next()) {
	    		 car.setId(rs.getInt(1));
	    		 car.setMake(rs.getString(2));
	    		 car.setModel(rs.getString(3));
	    		 car.setPrice(rs.getFloat(4));
	    	 }
	    	 return car;
	     });
		return null;
	}

}
