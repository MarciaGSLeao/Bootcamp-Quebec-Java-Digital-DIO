package model.exceptions;

@SuppressWarnings("serial")
public class DivisionNotExactException extends RuntimeException{
	
	private int numerador;
	private int denominador;
	
	public DivisionNotExactException (String msg, int numerador, int denominador){
		super(msg);
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}

}
