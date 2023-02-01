package com.sou.dao;

import java.util.List;

import com.sou.model.Product;

public interface ProductDao {
  void add(Product p);
  void update(Product p);
  void deleteByID(int id);
  Product selectByID(int id);
  List<Product> selectAll();
}
