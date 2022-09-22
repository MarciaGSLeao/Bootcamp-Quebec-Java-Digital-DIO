package model;

public class CustomizedException_2 {
	
	public static void main(String[] args) {
		
		int[] n = {4, 5, 8, 10};
		int[] d = {2, 4, 0, 2, 8};
		
		int[] quotientList = null;
		
		try {
			for(int p = 0; p < d.length; p++) {
				
				Double num = Double.parseDouble(n);
				int q = n[p] / d[p];
				System.out.println(q);
			}
		}catch(ArithmeticException e) {
			System.out.println("Impossível divisão por 0.");
		}
	}
	
}
