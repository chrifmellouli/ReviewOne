package com.sonysoft.reviews;

import com.sonysoft.exception.ExceptionOfLessThan;

public class CalculMain {

	public static void main(String[] args) {

		Calcul calcul = new Calcul(5, 6);
		try {
			calcul.remplirTableau(6);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error Size exceeded " + e.getMessage());
		}

		/**
		 * Le programme s'arrête ici à la ligne 20 parce qu'il y a une exception générée
		 * et non gérée. Donc on commente cette ligne.
		 */
		//calcul.remplirTableau1(7);

		try {
			calcul.remplirAutreTableau(6);
		} catch (Exception e1) {
			e1.getMessage();
		}

		try {
			calcul.remplirAutreTableau1(8);
		} catch (ExceptionOfLessThan e1) {
			System.out.println(e1.getMessage());
		}

		int a = 0;
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
