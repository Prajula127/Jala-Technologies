package arrays;

// a method to find number of even number and odd numbers in an array
public class EvenOdd {

	public static void main(String[] args) {
		int a[] = {1,2,3,5,6,7,8,9};
		evenOdd(a);
	}
public static void evenOdd(int[] a) {
	System.out.print("Even Numbers ");
	for(int i=0; i<a.length; i++) {
		if(a[i]%2 == 0) {
	System.out.print(a[i] +" ");	
		}
	}
	System.out.println();
	System.out.print("Odd Numbers ");
	for(int i=0; i<a.length; i++) {
		if(a[i]%2 != 0) {
	System.out.print(a[i] +" ");	
		}
	}
}
}
