package interfaces;
//two interfaces with the same method in both the interfaces.
interface Test1 {
    void show();
}
interface Test2 {
    void show();
}
class SameMet {

    void show(){
        System.out.println("Implemented method.");
    }
}
public class SameMethod { 
    public static void main(String[] args) 
    { 
    	SameMet  obj = new SameMet();
        obj.show();
    } 
}


