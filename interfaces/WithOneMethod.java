package interfaces;
// an interface with only one method and implement it in a class.
interface showtable{  
void show();  
}  
class WithOneMet implements showtable{  

	public void show(){
	System.out.println("Hello");
}  
}
public class WithOneMethod{
public static void main(String args[]){  
	WithOneMet obj = new WithOneMet();  
    	obj.show();  
}  
}

