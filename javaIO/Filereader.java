package javaIO;

//Write a program to read text from .txt file using FileReader
import java.io.FileReader;

public class Filereader {

public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("F://Prajula.txt");
		int i = 0;
		while((i = fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

}
