package com.sou.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Student")
public class Student {
   @Id
   @Column(name="id")
   private int id;
   private String name;
   private String email;
   @Temporal(TemporalType.DATE)
   private Date date;
   
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(int id, String name, String email, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.date = date;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", date=" + date + "]";
}
   
   
}
