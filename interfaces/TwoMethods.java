package interfaces;

//an interface with two methods Create an interface with two methods, but implement only one in a class
interface Printable{  
void print();  
void show();  
}  
class Methods{  
   void print(){
	System.out.println("Hello");
	}  
   void show() {
	   System.out.println("Hi");
   }
}
public class TwoMethods{   
public static void main(String args[]){  
	Methods obj = new Methods();  
obj.print();  
obj.show();
 }
}
