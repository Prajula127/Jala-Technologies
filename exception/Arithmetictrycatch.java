package exception;

//Handle the Arithmetic exception using try-catch block
public class Arithmetictrycatch {

	public static void main(String[] args) {
       
      int a = 10, b = 0;
      int divide;
      try {
		divide = a / b;
		System.out.println("Divide = "+divide);     

	} catch (ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println("can't divide");

	}
		}

}