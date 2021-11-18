package constructors;
//Call the constructors(both default and argument constructors) of super class from a child class
class Parent{
 int id;
	 Parent(){
			System.out.println("Constructor");
		}
	  Parent(int a){
		 id = a;
	 }
	  void display() {
		  System.out.println(id);
	  }
 }
	
class Child extends Parent{
	
public void display() {
	System.out.println("Child class: ");
	}
public void Msg() {
	display();
}
}
public class Person{
public static void main(String[] args) {
	Child obj = new Child();
	obj.display();
}
}
