package demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) {
		String str = "   nafisa   ";
		System.out.println(str.isBlank());
		System.out.println(str.length());
		System.out.println(str.strip());
		System.out.println(str.stripLeading());
		System.out.println(str.stripTrailing());
		
		try {
			Path path = Paths.get("resources/Input.txt");
			String data = Files.readString(path);
			System.out.println(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
