package loops;

//a program to find the prime or not
public class PrimeOrNot {

	public static void main(String[] args) {

		int num = 47;
		boolean prime = true;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				prime = false;
				break;
			}
		}
		if(prime == true) {
			System.out.println("is a Prime");
		}
		else
			System.out.println("not a Prime");

	}

}
