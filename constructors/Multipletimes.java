package constructors;
//Try to call the constructor multiple times with the same object
public class Multipletimes {
	Multipletimes(int i){
		System.out.println(i);
	}

	public static void main(String[] args) {
     
      int x = 10;
      while(x > 0) {
    	  Multipletimes a = new Multipletimes(x);  
      }
	}

}
