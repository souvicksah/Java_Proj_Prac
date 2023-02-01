package com.sou.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
	private int no;
    private String name;
public Product() {

}
public Product(int no, String name) {
	this.no = no;
	this.name = name;
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Product [no=" + no + ", name=" + name + "]";
}


}
