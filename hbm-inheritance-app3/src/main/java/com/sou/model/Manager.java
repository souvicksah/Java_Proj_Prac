package com.sou.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Manager extends Employee{
private float pa;
private float da;

public Manager() {
	super();
	// TODO Auto-generated constructor stub
}
public Manager(int id, String name, float salary) {
	super(id, name, salary);
	// TODO Auto-generated constructor stub
}
public Manager(int id) {
	super(id);
	// TODO Auto-generated constructor stub
}

public Manager(int id, String name, float salary,float pa, float da) {
	super(id, name, salary);
	this.pa = pa;
	this.da = da;
}
public float getPa() {
	return pa;
}
public void setPa(float pa) {
	this.pa = pa;
}
public float getDa() {
	return da;
}
public void setDa(float da) {
	this.da = da;
}
@Override
public String toString() {
	return "Manager [pa=" + pa + ", da=" + da + ", getPa()=" + getPa() + ", getDa()=" + getDa() + ", getId()=" + getId()
			+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + ", toString()=" + super.toString()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}

}
