package collections;

import java.util.HashMap;

public class Hashmap {

public static void main(String[] args) {
 HashMap<Integer, String> hm = new HashMap<>();
   hm.put(1, "Prajula");
   hm.put(2, "sandhya");
   hm.put(3, "Sweet");
   hm.put(4, "Sony");
   hm.put(4, "Maha");
   hm.put(5, "Hema");
   hm.put(6, "Ripsy");
   hm.put(7, "Manasa");
   hm.put(8, "Manasa");
   hm.put(9, "Susmi");
   hm.put(10, "Priya");
System.out.println(hm);
   System.out.println("Fetch the value... "+hm.get(3));
   System.out.println("size of hashmap..."+hm.size());
   System.out.println("Print all keys..."+hm.keySet());
   System.out.println("Remove.."+hm.remove(10));
   System.out.println("After remove "+hm);
   System.out.println("key 8 is present? "+hm.containsKey(8));
   System.out.println("value Priya is present "+hm.containsValue("Priya"));
   System.out.println("Map is empty "+hm.isEmpty());
	}

}
