package loops;
//Program to equal operator and not equal operators

import java.util.Scanner;

public class EqualOrNotEqual {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		   System.out.println("enter two numbers : ");
			 int a=sc.nextInt();
			 int b=sc.nextInt();
			 
			 if(a==b) {
			  System.out.println("two numbers are equal");
			 }
			 else if(a!=b) {
				System.out.println("two numbers are not equal");
					 }
		}
}
