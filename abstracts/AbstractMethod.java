package abstracts;

//Create an instance for the child class in child class and call abstract methods
abstract class grandParent{
	abstract void call();
	}
class Parentclass extends grandParent{
	void call() {
		System.out.println("Parent call() called");
	}
}
class Childclass extends grandParent{

	void call() {
      System.out.println("child call() called");		
	}
}	
public class AbstractMethod {

	public static void main(String[] args) {
     grandParent obj = new Childclass();
		
     obj.call();
	}

}
