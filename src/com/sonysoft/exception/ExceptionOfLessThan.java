/**
 * 
 */
package com.sonysoft.exception;

/**
 * @author asus
 *
 */
public class ExceptionOfLessThan extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3293478481548332078L;

	protected static String message = "La taille du tableau doit être inférieur à ";

	/**
	 * 
	 */
	public ExceptionOfLessThan() {
	}

	/**
	 * @param message
	 */
	public ExceptionOfLessThan(int n) {
		super(message+n);
	}

}
