package javaIO;

//Write text to a .txt file using BufferedWriter
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferedwriter {

	public static void main(String[] args) {
         try {
			FileWriter fw = new FileWriter("F://Buffered.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			String s = "Hello word";
			bw.write(s);
				bw.close();
				fw.close();
				System.out.println("Success");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("HELLO");
		}
         
	}

}
