package javaBasics;

/*Define the local and Global variables with the same name and print both variables and 
understand the scope of the variables*/
public class Variables {

	String name="Java"; //global variable
	
	void test() {
		String name="Developer"; // local variable
		System.out.println(name);
	}
	void test(String check) {
		System.out.println(name);

	}
	public static void main(String[] args) {
		Variables var=new Variables();
		var.test();
		var.test("hello");
	}
}
