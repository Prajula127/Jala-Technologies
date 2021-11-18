package operators;

//a function for arithmetic operators(+,-,*,/)
public class ArithmeticOperators {

	public static void main(String[] args) {
		int add = 0,subtract = 0,multiplication = 0;
        float divide = 0;
		 int a=20;
		 int b=8;
		 arithmetic(a,b,add,subtract,multiplication, divide);
	}
	public static void arithmetic(int a, int b, int add, int subtract,int multiplication, float divide) {
		 add = a+b;
		 subtract = a-b;
		 multiplication = a*b;
		 divide = a/b;
		 
		 System.out.println("add two numbers : " +add);
		 System.out.println("subtract two numbers : " +subtract);
		 System.out.println("multiflication of two numbers : " +multiplication);
		 System.out.println("divide of two numbers : " +divide);

	}
}
