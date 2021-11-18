package arrays;

//e a function to find the duplicate values of an array
public class DuplicateValues {

 public static void main(String[] args) {
   int a[] = {1,2,2,3,5,7,5};
   duplicate(a);
 }
 public static void duplicate(int a[]) {
   System.out.print("Duplicate Values are ");

   for(int i=0; i<a.length-1; i++) {
   for(int j=i+1; j<a.length; j++) {
	   if(a[i] == a[j]) {
			  
		   System.out.print(a[j] +" ");
	   }
   }
   }
	}

}
