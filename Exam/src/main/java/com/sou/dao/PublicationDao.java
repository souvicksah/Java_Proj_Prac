package com.sou.dao;

import java.util.List;

import com.sou.model.Publication;

public interface PublicationDao {
void add(Publication pb);
List<Publication> selectall();
void delete(int id);
Publication selectbyId(int id);
void update(Publication p);
}
