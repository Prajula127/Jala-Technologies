package loops;

//a program to print the odd and even numbers.
import java.util.Scanner;

public class OddEvenNumber {

 public static void main(String[] args) {
   
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Print Even and Odd numbers : ");
	 
	 int number = sc.nextInt();
	 System.out.println("Even numbers are : ");
	 for(int i=1; i<=number; i++) {
		 if(i%2 == 0) {
			 System.out.println(i);
		 }
	 }
	 System.out.println("Odd numbers are : ");
	 for(int i=1; i<=number; i++) {
		 if(i%2 == 1) {
			 System.out.println(i);
		 }
	 }
	 sc.close();
	}

}
