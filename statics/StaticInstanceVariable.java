package statics;
//Print all the static, instance variables in main method
public class StaticInstanceVariable {
  static int a = 20;
  int b = 10;
  
	public static void main(String[] args) {
		StaticInstanceVariable siv = new StaticInstanceVariable();
		int x = siv.b;
		System.out.println(x);

		System.out.println(StaticInstanceVariable.a);
	}

}
