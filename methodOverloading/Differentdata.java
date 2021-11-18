package methodOverloading;

/*Write two methods with the same name but different number of parameters of different 
data type and call the methods from main method*/
public class Differentdata {

	public void get(int id, String name) {
		System.out.println(id+","+name);
	}
	public void get(int id, String name, double value) {
		System.out.println(id+","+name+","+value);
		}
	public static void main(String[] args) {
		Differentdata diff = new Differentdata();
		diff.get(1, "Praju");
		diff.get(0, "Hello", 2);
	}

}
