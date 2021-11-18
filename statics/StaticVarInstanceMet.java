package statics;
//Print static variables in Instance methods
public class StaticVarInstanceMet {
	
	static int x = 20;

	void display() {
		System.out.println(x); 
	}
	public static void main(String[] args) {
       
		StaticVarInstanceMet si = new StaticVarInstanceMet();
		si.display();
	}

}
