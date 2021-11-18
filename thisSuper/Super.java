package thisSuper;

//Print the fields/instance members of the parent class using super
class Animal{
	String color = "Brown";
}
class Dog extends Animal{
	String color = "White";
	void prints() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class Super {

	public static void main(String[] args) {
       Dog d = new Dog();
       d.prints();
	}

}
