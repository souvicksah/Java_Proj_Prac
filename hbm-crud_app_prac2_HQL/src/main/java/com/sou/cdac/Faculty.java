package com.sou.cdac;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="Faculty")
public class Faculty {
@Id
private int id;
@Column(name="name")
private String name;
private String subject;
@Temporal(TemporalType.DATE)
private Date joindate;
public Faculty() {

	
}
public Faculty(int id) {
this.id=id;
	
}


public Faculty(int id, String name, String subject, Date joindate) {
	super();
	this.id = id;
	this.name = name;
	this.subject = subject;
	this.joindate = joindate;
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
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public Date getJoindate() {
	return joindate;
}
public void setJoindate(Date joindate) {
	this.joindate = joindate;
}
@Override
public String toString() {
	return "Faculty [id=" + id + ", name=" + name + ", subject=" + subject + ", joindate=" + joindate + "]";
}


}
