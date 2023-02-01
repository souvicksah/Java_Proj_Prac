package com.sou.service;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sou.dao.ProductDao;
import com.sou.model.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;
	@Override
	public void save(Product p) {
		// TODO Auto-generated method stub
		pdao.save(p);
		
	}

	@Override
	public void modify(Product p) {
		// TODO Auto-generated method stub
		pdao.save(p);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		pdao.deleteById(id);
	}

	@Override
	public Product selectById(int id) {
		// TODO Auto-generated method stub
		Optional<Product> op=pdao.findById(id);
		if(op.isEmpty())
			return null;
		return op.get();
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		Iterable<Product> itr=pdao.findAll();
		List<Product> list=new ArrayList();
		itr.forEach(ele->list.add(ele));
		return list;
	}

}
