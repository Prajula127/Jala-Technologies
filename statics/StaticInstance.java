package statics;
/*Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
methods and a main method.*/

public class StaticInstance {
    //static variable
	static int x = 20;
	static int y = 10;
	//instance variable
	int a = 30;
	int b = 40;
	
	// declare an instance method
	void display() {
		System.out.println(x); //we can access static member within instance area

		System.out.println(a);
	}
	void display2() {
		System.out.println(b);
	}
	//declare static method
	static void show() {
	/*	System.out.println(a); 
       compile time error
        instance variable can't access inside static method*/
		System.out.println(x);
	}
	static void show2() {
		System.out.println(y);
	}
	//main method
	public static void main(String[] args) {
		StaticInstance si = new StaticInstance();
		//call instance method
		si.display();
		si.display2();
		
       //call static method
		show();
		show2();
	}

}
