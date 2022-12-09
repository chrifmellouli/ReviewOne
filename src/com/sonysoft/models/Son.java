package com.sonysoft.models;

public class Son {

	private String name;
	private Mother mother;
	private Father father;
	
	public Son() {
		super();
	}


	public Son(String name, Mother mother, Father father) {
		super();
		this.name = name;
		this.mother = mother;
		this.father = father;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Mother getMother() {
		return mother;
	}

	public void setMother(Mother mother) {
		this.mother = mother;
	}

	public Father getFather() {
		return father;
	}

	public void setFather(Father father) {
		this.father = father;
	}

	@Override
	public String toString() {
		return "I'm the son and my name is" + name+ ". My father's name is "+father+" and my mother's name is "+mother.getName();
	}

}
