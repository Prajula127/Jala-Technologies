package constructors;
//a class with a default constructor, one argument constructor and two argument constructors
public class Constructor {
 int id;
 String name;
 //creating a default constructor
 Constructor(){
		System.out.println("Constructor");
	}
 //creating one arg constructor
  Constructor(int a){
	 id = a;
 }
  void display() {
	  System.out.println(id);
  }
//creating two arg constructor
 Constructor(int a, String str){
	 id = a;
	 name = str;
 }
void msg() {
System.out.println(id+" "+name);	 
 }
 
	public static void main(String[] args) {
	 Constructor cs2 = new Constructor();
     Constructor cs = new Constructor(1);
     Constructor cs1 = new Constructor(1, "Praju");

     cs.display();
     cs1.msg();
	}

}
