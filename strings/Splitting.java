package strings;

//Splitting strings with split()
public class Splitting {
	 public static void main(String[] args) {
		    String str = new String("java string");
		    String s[] = str.split(" ");
		    for( String a : s) {
		    System.out.print(a);
}
}
}