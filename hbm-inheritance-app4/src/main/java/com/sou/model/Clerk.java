package com.sou.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Clerk  extends Employee{

	private float hra;
	public Clerk() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clerk(float hra) {
		super();
		this.hra = hra;
	}

	

	public Clerk(int id, String name, float salary,float hra) {
		super(id, name, salary);
		this.hra = hra;
		// TODO Auto-generated constructor stub
	}

	public Clerk(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Clerk [hra=" + hra + "]";
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}
	
	
}
