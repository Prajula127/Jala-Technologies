package interfaces;

//Create a PRIVATE or PROTECTED interface and print the values as above scenario
public interface ABC{
	private int add(int a, int b) {
     return a+b;
	}
}
public class Private implements ABC{
public static void main(String[] args) {
	Private d = new Private();
	d.add(2, 5);
	System.out.println("Add");
}

}
