package inheritance;

//Call an overridden method with super class reference to B and C class’s objects
 class Super{
	
 public void eat() {
		System.out.println("B eat() called");
	}
}
 class Subclass extends Super{
	public void eat() {
		super.eat();
		System.out.println("C eat() called");

	}
}
public class BCclass{
public static void main(String[] args) {
	 Subclass obj = new Subclass();
	  obj.eat();
     
	}

}
