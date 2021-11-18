package javaIO;

//Write a program to write text to .txt file using OutputStream
import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {

		 try { 
				FileOutputStream fos = new FileOutputStream("F://Praju.txt");
				String s = "Java Programming";
				char ch[] = s.toCharArray();
				for(int i=0; i<s.length(); i++) {
				fos.write(ch[i]);
				}
					fos.close();
					System.out.println("Success");
				} catch (Exception e) {
					e.printStackTrace();
				}
		          
	}

}
