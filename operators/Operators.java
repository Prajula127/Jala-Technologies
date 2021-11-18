package operators;

//Programs on Logical AND,OR operator and Logical NOT
import java.util.Scanner;

public class Operators {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	   System.out.println("enter number : ");
		 int x=sc.nextInt();
		
		 //Logical AND
		 if(x > 5 && x < 10) {
			System.out.println("condition is true"); 
		 }
		 else
			 System.out.println("condition is false");
		 
		//Logical OR 
		 if(x > 5 || x < 4) {
				System.out.println("condition is true"); 
			 }
			 else
				 System.out.println("condition is false");
		 
		 //Logical NOT
		 if(!(x > 5)) {
			 System.out.println("condition is true");
		 }
		 else
			 System.out.println("condition is false");
}
}