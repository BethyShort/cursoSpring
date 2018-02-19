package com.ejemplo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Dealer {

	
	private Person person;
	private int type;
	private String action;

	@Autowired
	public Dealer(Person person) {
	    this.person=person;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "Dealer [person=" + person + ", type=" + type + ", action="
				+ action + "]";
	}

	
}