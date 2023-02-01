package com.sou.service;

import java.util.List;

import com.sou.model.Publication;

public interface pubservice {
void add(Publication p);
List<Publication> select();
void delete(int id);
Publication selectById(int id);
void update(Publication p);
}
