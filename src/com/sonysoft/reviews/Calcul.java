package com.sonysoft.reviews;

import com.sonysoft.exception.ExceptionOfLessThan;

public class Calcul {

	// Polymorphisme
	protected int size;
	protected int size1;
	protected int[] tableau;
	protected int[] tableau1;
	protected int[] autreTableau;
	protected int[] autreTableau1;

	public Calcul(int size, int size1) {
		this.size = size;
		this.size1 = size1;
		this.tableau = new int[size];
		this.tableau1 = new int[size1];
	}

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

	/**
	 * 
	 * @param n
	 */
	public void remplirTableau(int n) {
		System.out.println("\n");
		System.out.println("**********************************");
		System.out.println("debut méthode remplirTableau de taille max = "+this.size);
		for (int i = 0; i < n; i++) {
			tableau[i] = 1;
		}
	}
	

	/**
	 * 
	 * @param n
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public void remplirTableau1(int n) throws ArrayIndexOutOfBoundsException {
		System.out.println("\n");
		System.out.println("**********************************");
		System.out.println("debut méthode remplirTableau1 de taille max = "+this.size1);
		for (int i = 0; i < n; i++) {
			tableau1[i] = 1;
		}
	}

	/**
	 * 
	 * @param size : La taille de ce tableau doit être supérieure à 7
	 * @throws Exception
	 */
	public void remplirAutreTableau(int size) throws ArrayIndexOutOfBoundsException {
		System.out.println("\n");
		System.out.println("**********************************");
		System.out.println("debut méthode remplirAutreTableau");
		System.out.println("Contrainte : La taille de ce tableau doit être supérieure à 7");
		
		if (size > 7) {
			autreTableau = new int[size];
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}

	}

	/**
	 * 
	 * @param size : La taille de ce tableau doit être inférieur à 7
	 * @throws Exception
	 */
	public void remplirAutreTableau1(int size) throws ExceptionOfLessThan {
		System.out.println("\n");
		System.out.println("**********************************");
		System.out.println("debut méthode remplirAutreTableau1");
		System.out.println("Contrainte : La taille de ce tableau doit être infénieur à 7");
		
		if (size < 7) {
			autreTableau = new int[size];
		} else {
			throw new ExceptionOfLessThan(size);
		}
	}

}
