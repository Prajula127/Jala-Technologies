package loops;

//Print gender (Male/Female) program according to given M/F using switch

import java.util.Scanner;

public class MaleOrFemale {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("What is your gender (Male or Female)?");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'M':
			System.out.println("Gender is Male");
			break;
		case 'F':
			System.out.println("Gender is Female");
		}
		sc.close();
	}

}
