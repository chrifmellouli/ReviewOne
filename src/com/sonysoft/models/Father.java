package com.sonysoft.models;

public class Father {

	private String name;

	public Father() {
		super();
	}

	public Father(String name) {
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
	public String toString() {
		return "I'm the father. My name is " + name;
	}

}
