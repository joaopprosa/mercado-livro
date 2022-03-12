package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {

			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine(); // le uma linha do arquivo

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
