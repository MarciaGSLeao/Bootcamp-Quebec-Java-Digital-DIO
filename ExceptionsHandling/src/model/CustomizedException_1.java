package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

import javax.swing.JOptionPane;

import model.exceptions.ImpossibleFileOpenningException;

public class CustomizedException_1 {
	
	public static void main(String[] args) {
		
		String fileName = JOptionPane.showInputDialog(null,
				"Informe o caminho do arquivo: ");
		
		printFileAtConsole(fileName);
	}
	
	public static void printFileAtConsole(String fileName) {
		
		try {
			BufferedReader br = readFile(fileName);
			String line = br.readLine();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			do {
				bw.write(line);
				bw.newLine();
				line = br.readLine();
			}while(line != null);
			bw.flush();
			br.close();
		}catch (ImpossibleFileOpenningException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"Ocorreu um erro inesperado. Entre em contato com o suporte. "
					+ e.getMessage() );
			e.printStackTrace();
		}
		
	}
	
	public static BufferedReader readFile (String fileName) throws ImpossibleFileOpenningException {
		
		File file = new File(fileName);
		
		try {
			return new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e) {
			throw new ImpossibleFileOpenningException(file.getName(), file.getPath());
		}
	}

}
