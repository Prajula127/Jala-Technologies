package arrays;

// a method to find the second largest number in an array
public class SecondLargest {

	public static void main(String[] args) {
		int a[] = {1,6,8,9,2};
		 int first =a.length;
		 int second = a.length;
		secondLargest(a, first, second);
		}
		public static void secondLargest(int[] a, int first, int second) {
		first=second=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i] > first) {
				second = first;
				first = a[i];
			}else {
				if(a[i] > second && a[i]!= first) {
					second = a[i];
				}
			}
		}
		System.out.println("Second Largest Number is "+second);
	}

}
