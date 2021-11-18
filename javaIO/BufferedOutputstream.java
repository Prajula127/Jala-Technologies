package javaIO;

//Write text to a .txt file using BufferedOutputStream
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputstream {

	public static void main(String[] args) {

		try {
			FileOutputStream fos = new FileOutputStream("F://Demo.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);

				String s = "Hello word";
				for(int i=0; i<s.length(); i++) {
				bos.write(s.charAt(i));
				}
					bos.close();
					fos.close();
					System.out.println("Success");
			
		  } catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

