package operators;
// a program to find the two numbers equal or not
import java.util.Scanner;

public class EqualOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter two numbers : ");
			 int a=sc.nextInt();
			 int b=sc.nextInt();
		if((a-b)==0) {
			System.out.println("numbers are equal");
		}
		else 
			System.out.println("numbers are not equal");
	}

}
