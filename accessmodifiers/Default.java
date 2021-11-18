package accessmodifiers;

class A{
	void msg() {
		System.out.println("Print A");
	}
}
public class Default {

	public static void main(String[] args) {
     A obj = new A();
     obj.msg();
	}
}

