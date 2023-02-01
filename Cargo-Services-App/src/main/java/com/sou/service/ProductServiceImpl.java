package com.sou.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sou.dao.ProductDao;
import com.sou.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pdao;
	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		pdao.add(p);
	}

	@Override
	public void modify(Product p) {
		// TODO Auto-generated method stub
		pdao.update(p);
	}

	@Override
	public void removeByID(int id) {
		// TODO Auto-generated method stub
		pdao.deleteByID(id);
		
	}

	@Override
	public Product getByID(int id) {
		// TODO Auto-generated method stub
		return pdao.selectByID(id);
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return pdao.selectAll();
	}

}
