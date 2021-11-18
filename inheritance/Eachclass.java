package inheritance;
/*Create a class with main method. Create an object for each class A, B and C in main 
method and call every method of each class using its own object/instance.*/
class Animal{  
void eat(){
	System.out.println("eating");
	}  
}  
class Dog extends Animal{  
void eat(){
	System.out.println("eating fruits");
	}  
}  
class Cat extends Dog{  
void eat(){
	System.out.println("drinking milk");
	} 
}
public class Eachclass {
public static void main(String args[]){  
Animal a1=new Animal();  
Animal a2=new Dog();  
Animal a3=new Cat();  
a1.eat();  
a2.eat();  
a3.eat();  
}
}
