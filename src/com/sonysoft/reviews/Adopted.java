package com.sonysoft.reviews;

public class Adopted extends Mother{

	@Override
	public void displayMessage() {
		System.out.println("i'm adopted!");
	}
	
	@Override
	public void commonMessage() {
		super.commonMessage();
		System.out.println("NOOOOOOO! you're not my mother!");
	}

}
