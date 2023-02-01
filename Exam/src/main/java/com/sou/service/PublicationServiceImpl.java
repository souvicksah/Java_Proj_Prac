package com.sou.service;

import java.util.List;

import com.sou.dao.PublicationDao;
import com.sou.dao.PublicationDaoImpl;
import com.sou.model.Publication;

public class PublicationServiceImpl implements pubservice {
	private PublicationDao pdao;
	

	public PublicationServiceImpl() {
		pdao=new PublicationDaoImpl();
	}

	@Override
	public void add(Publication p) {
		// TODO Auto-generated method stub
		pdao.add(p);
		
	}

	@Override
	public List<Publication> select() {
		// TODO Auto-generated method stub
		return pdao.selectall();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pdao.delete(id);
		
	}

	@Override
	public Publication selectById(int id) {
		return pdao.selectbyId(id);
	}

	@Override
	public void update(Publication p) {
		// TODO Auto-generated method stub
		pdao.update(p);
		
	}

}
