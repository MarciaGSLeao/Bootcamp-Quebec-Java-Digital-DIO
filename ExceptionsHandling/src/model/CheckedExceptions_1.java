package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CheckedExceptions_1 {
	
	public static void main(String[] args) throws IOException {
		
		String fileName = "MyLittleCatFemale.txt";
		
		PrintFileAtConsole(fileName);
		
	}
	
	public static void PrintFileAtConsole(String fileName) throws IOException  {
		
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
