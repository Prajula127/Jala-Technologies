package javaIO;
//Write a program to write text to .txt file using FileWriter
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("F://Prajula.txt");
			String s = "Java Programming";
			char ch[] = s.toCharArray();
			for(int i=0; i<s.length(); i++) {
			fw.write(ch[i]);
			}
				fw.close();
				System.out.println("Success");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
    
	}

}
