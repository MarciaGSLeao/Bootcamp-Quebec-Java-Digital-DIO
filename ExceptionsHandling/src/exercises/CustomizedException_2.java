package exercises;

import model.exceptions.DivisionNotExactException;

public class CustomizedException_2 {
	
	public static void main(String[] args) {
		
		int[] n = {4, 5, 8, 10};
		int[] d = {2, 4, 0, 2, 8};
		
		for(int p = 0; p < d.length; p++) {
			try {
				if (n[p] %2 != 0) throw new DivisionNotExactException("Divisão Não Exata!", n[p], d[p]);
					
				int q = n[p] / d[p];
				System.out.println(n[p] + "/" + d[p] + " = " + q);
			}catch (DivisionNotExactException e) {
				System.out.println(e.getMessage());
			}catch(ArithmeticException e) {
				System.out.println("Impossível divisão por 0!");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posição inexistente!");
			}
		}
	}
}
