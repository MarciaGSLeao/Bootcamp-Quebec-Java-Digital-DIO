package model.exceptions;

@SuppressWarnings("serial")
public class DivisionNotExactException extends RuntimeException{
	
	private int numerador;
	private int denominador;
	
	public DivisionNotExactException (int numerador, int denominador){
		super("Teste");
		this.numerador = numerador;
		this.denominador = denominador;
		
		if (denominador == 0) {
			throw new RuntimeException("Impossível divisão por 0");
		}
	}
}
