package thisSuper;

//Print the fields/instance members of the current class using this 
public class This {
  String name;
  int id;

	public This(String name, int id) {
	this.name = name;
	this.id = id;
 }
	public static void main(String[] args) {
       This obj = new This("Prajula", 20);
System.out.println(obj.name +" and "+ obj.id);
	}
}
