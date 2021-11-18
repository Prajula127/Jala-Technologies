package strings;

//equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
public class Stringmethod {

public static void main(String[] args) {
	String str = "Prajula";
	String str1 = "Yalangi";
    String str2 = "my name is Prajula";
			
			System.out.println(str.equalsIgnoreCase(str1));
			System.out.println(str.compareTo(str1));
			System.out.println(str2.startsWith("my"));
			System.out.println(str2.endsWith("is"));
		}   
	}


