package javaIO;

//Read text from a .txt file using BufferedInputStream
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputstream {

	public static void main(String[] args) {
		
		try {
		FileInputStream fis = new FileInputStream("F://Demo.txt");
	    BufferedInputStream bis = new BufferedInputStream(fis);
	    int i = 0;
		while((i = bis.read()) != -1) {
			System.out.print((char)i);
		}
		bis.close();
		fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}       
	}

}
