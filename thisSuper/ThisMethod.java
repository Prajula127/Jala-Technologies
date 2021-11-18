package thisSuper;

//Call constructor of the current class using this()
public class ThisMethod{
    int a;
    int b;
 
  //Default constructor
    ThisMethod(){ 
        this(10, 20);
        System.out.println("Inside  default constructor "+a +" and "+b);
    }
     
    //Parameterized constructor
    public ThisMethod(int a, int b) {
		this.a = a;
		this.b = b;
        System.out.println("Inside parameterized constructor "+a +" and "+b);
    }
 
    public static void main(String[] args){
    	ThisMethod obj = new ThisMethod();
    	
    }
}
