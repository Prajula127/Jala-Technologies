package arrays;

//a function to insert an element at a specific position in the array
import java.util.Arrays;

public class InsertElement {

public static void main(String[] args) {
  int a[] = {1,2,4,5,6};
  int index=2;
	a=insert(a,3,index);
	System.out.println(Arrays.toString(a));
	}
public static int[] insert(int a[], int element, int index) {
	int b[] = new int[a.length+1];
	for(int i=0; i<a.length; i++) {
		b[i] = a[i];
	}
	b[index] = 3;
	for(int i=index+1; i<=a.length; i++) {
		b[i] = a[i-1];
	}
	return b;
	}

}
