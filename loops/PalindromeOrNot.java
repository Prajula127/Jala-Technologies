package loops;

//a program to palindrome or not.
public class PalindromeOrNot {

	public static void main(String[] args) {

		int num = 121, r, sum=0;
		int temp = num;
		while(num > 0) {
			r = num % 10;
			num = num / 10;
			sum = (sum * 10) + r;
		}
		if(temp == sum) {
			System.out.println("is a Palindrome");
		}
		else
			System.out.println("Not a Palindrome");

	}

	}

