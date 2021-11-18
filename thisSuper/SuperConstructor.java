package thisSuper;

//Use this() and super() in methods not in constructors
public class SuperConstructor {

	public SuperConstructor() {
		this(10);
	}

	public SuperConstructor(int i) {
       System.out.println("Super Constructor");
	}
}
public class ThisConstructor extends SuperConstructor{

	public ThisConstructor(int i) {
		super(i);
	}

public static void main(String[] args) {
     ThisConstructor tc = new ThisConstructor(1);
     
	}

}
