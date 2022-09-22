package exercises;

import javax.swing.JOptionPane;

public class UncheckedExceptions {
	
	public static void main(String[] args) {
		
		// DIVIDIR DOIS NÚMEROS.
		
		boolean looping = true;
		
		do {
			try {
				String a = JOptionPane.showInputDialog("Numerador: ");
				String b = JOptionPane.showInputDialog("Denominador: ");
				
				Double result = Double.parseDouble(a.replace("," , "."))/ Double.parseDouble(b.replace("," , "."));
				System.out.printf("Resultado: %.2f%n", result);
				
				looping = false;
				
			}catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Formato Inválido! \nInforme um número real.");
			}catch (ArithmeticException e) {
				JOptionPane.showMessageDialog(null, "Não é possível a divisão por 0!");
			}
		}
		while(looping);
	}
}
