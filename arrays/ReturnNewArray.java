package arrays;

// a program to remove the duplicate elements and return the new array

public class ReturnNewArray {

 public static void main(String[] args) {
  int a[] = {1,2,2,3,4,5,5,6};
  System.out.print("Array elements are ");
  for(int i=0; i<a.length; i++) {
	  System.out.print(a[i] +" ");
  }
  System.out.println();
  System.out.print("New Array Elements are ");
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


