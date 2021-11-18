package statics;
//Call static methods in instance methods
public class StaticInstanceMetod {
  static int product(int a, int b) {  //static method
	  return a * b;
  }
   int add(int x, int y) { //instance method
	  return x + y;
  }
	public static void main(String[] args) {
		StaticInstanceMetod sim = new StaticInstanceMetod();
		//call instance
		int ans1 = sim.add(5, 4);
	       System.out.println(ans1);
	       
	   // call static
    /*  int ans = sim.product(1, 2);
       System.out.println(ans); */
       System.out.println(StaticInstanceMetod.product(2, 3));

	}

}
