package arrays;

// a function to copy an array to another array

public class CopyAnArray {

	public static void main(String[] args) {
  
		int a[] = {1,2,3,4};
		int b[] = new int[a.length];
		copyArray(a,b);
	}
	public static void copyArray(int a[], int b[]) {
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		System.out.print("Array of a : " );
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
		System.out.println();
		
		System.out.print("Copy Array : ");
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i] +" ");
		}
		}
	}


