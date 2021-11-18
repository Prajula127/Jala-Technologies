package arrays;

// a function to reverse an array of integer values
public class ReverseArray {

 public static void main(String[] args) {
   int a[] = {1,2,3,4,5};
   reverseArray(a);
	}
public static void reverseArray(int a[]) {
	int b[] = new int[a.length];
	int j = a.length;
	for(int i=0; i<a.length; i++) {
		b[j-1] = a[i];
		j = j-1;
	}
	System.out.println("Reverse Array");
	for(int k=0; k<a.length; k++) {
		System.out.print(b[k] +" ");
	}
}
}
