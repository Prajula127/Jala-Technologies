package abstracts;

//Create an instance for the child class in child class and call non-abstract method
abstract class Parent{
	
	 void call() {
		System.out.println("calling ");
	}
}
class Child extends Parent{

}
	public class NonAbstractMethod{
public static void main(String[] args) {
	Child obj = new Child();
     obj.call();
	}

}
