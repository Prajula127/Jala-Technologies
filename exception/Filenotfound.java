package exception;
//Write a program to generate FileNotFoundException
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Filenotfound {

	public static void main(String[] args) throws FileNotFoundException{
		FileInputStream fin = new FileInputStream("F://Praju.txt");
		System.out.println("File exist");
      
	}

}
