package arrays;

// a function to find the missing number of sorted array of 1 to 100
public class MissingNumber {

	public static void main(String[] args) {

		int a[] = {3,5,8,9,55};
		missingNumber(a);
		
	}
public static void missingNumber(int a[]) {
	System.out.println("Given Sorted Array :" );
	for(int i=0; i<a.length; i++) {
		System.out.print(a[i]+ " ");
	}
	System.out.println();
		System.out.println("Number missing 1 to 100 in Array ");
		int j = 0;
		for(int i=1; i<=100; i++) {
			if(j<a.length && i==a[j]) {
				j++;
		}else {
			System.out.print(i+" ");
		}
	}
}
}
