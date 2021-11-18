package loops;

//. Program for multiple if else statement(Largest number in 10,20 and 30)
public class LargestIfElse {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 30;
		if(a >= b && a >= c) {
		System.out.println(a + " is the Largest number");
	}else {
		if(b >= a && b >= c) {
			System.out.println(b + " is the Largest number");
		}else {
			System.out.println(c + " is the Largest number");

		}
	}

	}
}
