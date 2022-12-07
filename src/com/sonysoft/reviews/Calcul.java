package com.sonysoft.reviews;

public class Calcul {

	//Polymorphisme
	
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, float b) {
		return (int) (a + b);
	}
	
	public int add(float a, int b) {
		return (int) (a + b);
	}

	public int add(float a, float b) {
		return (int) (a + b);
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		Calcul calcul = new Calcul();

		int a = 2;
		int b = 3;
		int c = 4;
		float d = 5f;
		float e = 6f;

		calcul.add(a, b);
		calcul.add(a, d);
		calcul.add(d, a);
		calcul.add(d, e);
		calcul.add(a, b, c);

	}

}
