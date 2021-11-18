package interfaces;
//an interface with a default method and implement it in a class
interface TestInterface{

    default void show(){
      System.out.println("Default Method Executed");
    }
}
  
class Mehod implements TestInterface{
}
public class DefaultMehod{
	public static void main(String args[]){
    Mehod d = new Mehod();
          d.show();
    }
}
