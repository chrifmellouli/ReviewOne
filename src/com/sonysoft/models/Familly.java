package com.sonysoft.models;

public class Familly {

	public static void main(String[] args) {

		Mother sonia = new Mother("Sonia");
		Father ezzedin = new Father("Ezzeddin");
		Son toukebri = new Son("Toukebri", sonia, ezzedin);
		System.out.println(toukebri.toString());
	}

}
