package exception;
//Write a program to generate NoSuchMethodException

class MethodException{
	public void get(int id, String name) {
		System.out.println(id+","+name);
	}
}
public class NosuchMethod {

	public static void main(String[] args) {
		MethodException obj = new MethodException();
		obj.call(1,"Prajula");
	}

}
