package operators;

///Program for relational operators (<,<==, >, >==)
import java.util.Scanner;

public class Relational {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		   System.out.println("enter two numbers : ");
			 int a=sc.nextInt();
			 int b=sc.nextInt();
			 
			 System.out.println("a < b :" +(a < b));
			 System.out.println("a <= b :" +(a <= b));
			 System.out.println("a > b :" +(a > b));
			 System.out.println("a >= b :" +(a >= b));

	}

}
