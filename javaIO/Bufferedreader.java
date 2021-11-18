package javaIO;

//Read text from a .txt file using BufferedReader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Bufferedreader {

	public static void main(String[] args) {
			try {
				FileReader fr = new FileReader("F://Buffered.txt");
				BufferedReader br = new BufferedReader(fr);
				String str;
				while((str = br.readLine()) != null) {
					System.out.print(str);
				}
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		  
	}

}
