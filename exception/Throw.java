package exception;

//Write a method which throws exception, Call that method in main class without try block
public class Throw {

	public static void main(String[] args) {
     int a = 13;
     validate(a);
     System.out.println("throw exception");
	}
 public static void validate(int a) {
	 if(a < 18) {
	 throw new ArithmeticException("Person is not eligible");
	 }else {
		 System.out.println("Person is eligible");
	 }
 }
}
