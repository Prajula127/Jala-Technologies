package thisSuper;

//Call constructor of the parent class using super()
class Parent{  
  Parent(){
	System.out.println("Parent class");
	}  
}  
class Child extends Parent{  
  Child(){  
 super();  
System.out.println("Child class");  
}  
}  
public class SuperMethod{  
public static void main(String args[]){  
 Child p = new Child();  
}
}  

