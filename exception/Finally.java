package exception;
//Write a program with finally block
public class Finally {
	public static void main(String[] args) {
	       
	      int a = 10, b = 0;
	      int divide;
	      try {
			divide = a / b;
			System.out.println("Divide = "+divide);
		} catch (ArithmeticException ae) {
	        
			System.out.println("can't divide");
	      }finally{
	    	System.out.println("finally block");  
	      }
		}
}
