package accessmodifiers;

class Demo{
	private int a = 40;
	private void run() {
		System.out.println("print a");
	}
}
public class Private {

public static void main(String[] args) {
  Demo obj = new Demo();
   System.out.println(obj.a);
}
}

