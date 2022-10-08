package challenge;

public class Calc {

	public static void sum(double number1, double number2) {
		double result = number1 + number2;
		System.out.printf("A soma de %.2f e %.2f é %.2f%n", number1, number2, result); 
	}
	
	public static void minus(double number1, double number2) {
		double result = number1 - number2;
		System.out.printf("A subtração de %.2f e %.2f é %.2f%n", number1, number2, result);  
	}
	
	public static void multiplied(double number1, double number2) {
		double result = number1 * number2;
		System.out.printf("A subtração de %.2f e %.2f é %.2f%n", number1, number2, result); 
	}
	
	public static void divided(double number1, double number2) {
		double result = number1 / number2;
		System.out.printf("A divisão de %.2f e %.2f é %.2f%n", number1, number2, result); 
	}
	
}
