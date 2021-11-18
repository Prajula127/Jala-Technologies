package exception;
//Write a program to generate IOException
import java.io.FileInputStream;
import java.io.IOException;

public class IOExceptions {
	 public static void main(String[] args) throws IOException {
	FileInputStream in = new FileInputStream("input.txt");
    System.out.println("This is not printed");
}
}