package abstracts;

//Create an abstract class with abstract and non-abstract methods
abstract class Person{  
	abstract void call();  
	   void run(){
		   System.out.println("run method");
		   }  
	 }  
	class Student extends Person{  
	 void call(){
		 System.out.println("call method");
		 }  
	 }  

public class AbstractClass {
public static void main(String args[]){  
	  Person obj = new Student();  
	  obj.call();
	  obj.run();  
	 }  

}
