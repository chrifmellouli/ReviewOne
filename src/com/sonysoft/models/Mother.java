package com.sonysoft.models;

public class Mother implements Baby{

	private String name;

	public Mother() {
		super();
	}

	public Mother(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public Son makeBaby(String name, Father father) {
		Son son = new Son(name, this, father);
		return son;
	}
	
	@Override
	public String toString() {
		return "I'm the mother. My name is " + name;
	}
}
