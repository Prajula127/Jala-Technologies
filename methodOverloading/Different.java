package methodOverloading;

/*Write two methods with the same name but different number of parameters of same 
data type and call the methods from main method*/
class Parentclass{
	void call(int a, int b) {
	System.out.println(a +" "+b);
	}
}
class Childclass extends Parentclass{
	void call(int a, int b) {
		super.call(1, 2);
		System.out.println(a +" "+b);
	}
}
public class Different {

public static void main(String[] args) {
           Childclass obj = new Childclass();
           obj.call(3, 4);
	}
}
