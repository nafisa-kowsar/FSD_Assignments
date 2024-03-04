package io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFileDemo {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		FileInputStream reader = null;
		
		try {
			writer = new FileWriter("resources/Output.txt");
			reader = new FileInputStream("resources/Input.txt");
			int n=0;
			while((n = reader.read()) != -1) {
				System.out.print((char)n);
				writer.write(n);
			}
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		

	}

}
