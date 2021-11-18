package arrays;

// a method to remove duplicate elements from an array
public class RemoveDuplicates {

 public static void main(String[] args) {
	 int a[] = {1,2,2,3,5,7,5};
	 removeDuplicate(a);
 }
 public static void removeDuplicate(int [] a) {
	 System.out.println("Duplicate Values are ");
	   for(int i=0; i<a.length; i++) {
		   int count = 0;
	   for(int j=0; j<=i; j++) {
		   if(a[i] == a[j]) {
			 count++;	
		   }
	   }
	   if(count <= 1) {
		   System.out.print(a[i] +" ");

	   }
		}
	}

}
