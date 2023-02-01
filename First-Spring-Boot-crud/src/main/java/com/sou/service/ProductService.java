package com.sou.service;

import java.util.List;

import com.sou.model.Product;

public interface ProductService {
void save(Product p);
void modify(Product p);
void deleteById(int id);
Product selectById(int id);
List<Product> getAll();
}
