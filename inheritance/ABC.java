package inheritance;

/*Create three methods in each class, 2 methods are specific to each class and third 
method (override method) should be in all three Classes A, B and */
class grandParent{
	void call() {
	System.out.println("Class grandParent");	
	}
}
class Parent extends grandParent{
	void run() {
	System.out.println("Class Parent");	
	}
}
class Child extends Parent{
    void run() {
    	super.run();
		System.out.println("Class Child run()");

    }
}
public class ABC {

	public static void main(String[] args) {

		Child c = new Child();
		c.call();
		c.run();
	}

}
