package methodOverloading;

/*Write two methods with the same name and same number of parameters of different 
type and call from main method*/
public class Samedata {
   
	public void add(int a, String str) {
		System.out.println(a + " "  + str);
	}
	public void add(int a, int b, String s) {
		System.out.println(a +" "+s);
	}
	public static void main(String[] args) {
		Samedata sm = new Samedata();
		sm.add(10, "Prajula");
		sm.add(1, 2, "hello");
	}

}
