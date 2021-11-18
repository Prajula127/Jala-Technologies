package javaIO;

//Write a program to read text from .txt file using InputStream
import java.io.FileInputStream;

public class InputStream {


	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("F://Praju.txt");
			int i = 0;
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
