package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

public static void main(String[] args) {
 ArrayList<String> al = new ArrayList<>();
   al.add("Java");
   al.add("Python");
   al.add("Dotnet");
   al.add("C");
   al.add("C++");
   al.add("SQL");
   al.add("HTML");
   al.add("Javascript");
   al.add("Oracle");
   al.add("Angularjs");
   System.out.println("Add an element "+al);
   Iterator it =al.iterator();
   while(it.hasNext()) {
	   System.out.print("Iterate.. "+it.next()+" ");
   }
   System.out.println();
al.remove("Oracle");
System.out.println("Remove "+al);
al.set(0, "Datastructure");
System.out.println("Upadate "+ al);
System.out.println("size = "+al.size());
System.out.println("Get an element "+al.get(2));
System.out.println("Element is present or not ..."+al.contains("SQL"));
System.out.println("Element is present at a particular index..."+al.indexOf("HTML"));
al.clear();
System.out.println("Remove all "+al);
}
	}


