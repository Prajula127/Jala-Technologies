package constructors;
//Write constructors with return type int and String

public class Student {
int id;
String name;


public Student(int id, String name) {
	this.id = id;
	this.name = name;
}

public int getId() {
	return id;
}

public String getName() {
	return name;
}


@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]";
}

public static void main(String[] args) {

Student std=new Student(1,"Prajula");
System.out.println(std.toString());
}
}
