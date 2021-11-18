package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
Set<String> hs = new HashSet<>();
hs.add("Java");
hs.add("Dotnet");
hs.add("Python");
hs.add("SQL");
hs.add("c");
hs.add("c++");
hs.add("Html");
hs.add("css");
hs.add("Testing");
hs.add("Datastructure");
System.out.println(hs);
System.out.println("Size "+hs.size());
Iterator<String> it=hs.iterator();  
  while(it.hasNext()) {
	   System.out.print(it.next()+" ");
}
  System.out.println();
hs.remove("SQL");
System.out.println("Remove "+hs);
hs.clear();
System.out.println("Remove all "+hs);
	}

}
