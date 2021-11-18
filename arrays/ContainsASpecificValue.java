package arrays;

//a function to test if array contains a specific value
public class ContainsASpecificValue {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5, 6};
  System.out.println(contains(a,3));
	}
  public static boolean contains(int a[], int element) {
      for(int x : a) {
		 if(element == x) {
			return true; 
		 } 
      }
       return false;
	}
}


