package exception;
//Write a program with multiple catch blocks
public class Multicatch {

	public static void main(String[] args) {
		int a = 10, b = 0;
	      int divide;
	      try {
			divide = a / b;
			System.out.println("Divide = "+divide);
		} catch (ArithmeticException ae) {
	        System.out.println("Arithetic exception");
	      }  catch (NumberFormatException e) {
	          System.out.println("Number format exception");
	 	      }
	      catch (Exception e) {
         System.out.println(e.getMessage());
	      }
		}
	}


