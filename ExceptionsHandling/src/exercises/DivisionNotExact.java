package exercises;

@SuppressWarnings("serial")
public class DivisionNotExact extends RuntimeException{
	
	private int numerador;
	private int denominador;
	
	public DivisionNotExact (int numerador, int denominador){
		super("Teste");
		this.numerador = numerador;
		this.denominador = denominador;
		
		if (denominador == 0) {
			throw new RuntimeException("Impossível divisão por 0");
		}
	}
}