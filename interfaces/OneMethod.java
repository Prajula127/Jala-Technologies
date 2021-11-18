package interfaces;
//two interfaces with one method each
interface Print{  
void print();  
}  
interface Showable{  
void show();  
}  
class Test  implements Print,Showable{  
public void print(){
	System.out.println("Hello");
	}  
public void show(){
	System.out.println("Welcome");
	} 
}
public class OneMethod{  
public static void main(String args[]){  
	Test obj = new Test();  
obj.print();  
obj.show();  
 }  

}
