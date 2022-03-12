package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program {
	
	public static void main(String[] args) {
		
		String[] lines = new String[]{"Good Morning", "Good Afternoon", "Good Night"};
		
		String path = "c:\\temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine(); // quebra de linha
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
