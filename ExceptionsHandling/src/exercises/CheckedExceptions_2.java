package exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

public class CheckedExceptions_2 {
	
	public static void main(String[] args) {
		
		String fileName = "MyLittleCaFemale.txt";
		
		try {
			PrintFileAtConsole(fileName);
		}catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Revise o nome do arquivo!");
		} 
		catch (IOException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado! \nEntre em contato com o suporte.");
		} finally {
			System.out.println("Chegou no finally!");
		}
		
	}
	
	public static void PrintFileAtConsole(String fileName) throws IOException {
		
		File file = new File(fileName);
		
		BufferedReader br = new BufferedReader(new FileReader(file.getName()));
		String line = br.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		do {
			bw.write(line);
			bw.newLine();
			line = br.readLine();
		}while(line != null);
		bw.flush();
		br.close();
	}

}
