package loops;

///a program to find Armstrong number or not
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 370, r, sum=0;
		int temp = num;
		while(num > 0) {
			r = num % 10;
			num = num / 10;
			sum = sum + (r * r * r);
		}
		if(temp == sum) {
			System.out.println("Armstrong Number");
		}
		else
			System.out.println("Not Armstrong Number");

	}

}
