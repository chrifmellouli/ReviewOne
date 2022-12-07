package com.sonysoft.reviews;

public class Main {

	public static void main(String[] args) {
		
		Mother daughter = new Daugther();
		Mother son = new Son();
		Mother adopted = new Adopted();
		
		System.out.println("Son messages");
		son.displayMessage();
		son.commonMessage();
		System.out.println("\n");

		System.out.println("Daughter messages");
		daughter.displayMessage();
		daughter.commonMessage();
		System.out.println("\n");
		
		System.out.println("adopted messages");
		adopted.displayMessage();
		adopted.commonMessage();
		System.out.println("\n");
		
	}

}
