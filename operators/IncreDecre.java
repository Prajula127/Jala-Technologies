package operators;
//a method for increment and decrement operators(++, --)
public class IncreDecre {
 
	 static int num = 10;

public static void main(String[] args) {

	incDec();
}
public static void incDec() {
		 System.out.println("number is "+num);
		 num++;
		 System.out.println("increment the number :" + num);
		 num--;
		 System.out.println("decrement the number :" + num);
	}

}
