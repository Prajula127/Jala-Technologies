package interfaces;
//print the values of the interface fields and call the interface methods
interface Details{
 	int id = 10;
 	void call();
}
class Student implements Details{
 	public void call(){
  		System.out.println("id = "+id);
 	}
}
public class Interface {

	public static void main(String[] args) {
		Student s = new Student();
  		s.call();
	}

}
