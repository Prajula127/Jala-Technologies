package methodOverloading;

/*Write two methods with the same name and same number of parameters of same type 
and call from main method*/
class Parent{
	void call(int a, int b) {
	System.out.println("add "+(a+b));
	}
}
class Child extends Parent{
	void call(int a, int b) {
		super.call(10, 20);
		System.out.println("add "+(a+b));
	}
}
public class Same {

public static void main(String[] args) {
           Child obj = new Child();
           obj.call(20, 30);
	}

}
