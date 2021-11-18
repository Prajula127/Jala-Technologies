package constructors;
//Apply private, public, protected and default access modifiers to the constructor
class Modifiers{
	void display() {
		System.out.println("Default modifier");
	}
	public void display1() {
		System.out.println("Public modifier");
	}
	protected void display2() {
		System.out.println("Protected modifier");
	}
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	}

public class AccessModifiers {
	public static void main(String[] args) {
		Modifiers obj = new Modifiers();
		obj.display();
		obj.display1();
		obj.display2();
		obj.setName("Private modifier");
		System.out.println(obj.getName());
	}
}
