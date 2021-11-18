package strings;

//Matching a String Against a Regular Expression With matches()

public class Matches {

public static void main(String[] args) {
    String str = new String("my name is Prajula");
		
		System.out.println(str.matches("name"));
		System.out.println(str.matches("Prajula(.*)"));
		System.out.println(str.matches("(.*)name(.*)"));

	}

}
