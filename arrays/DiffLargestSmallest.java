package arrays;

//a function to get the difference of largest and smallest value
public class DiffLargestSmallest {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5,6,7,8,9};
		
		largestSmallestDiff(a);
	}
public static void largestSmallestDiff(int a[]) {
	int largest = a[0];
	int smallest = a[0];
	for(int i=1; i<a.length; i++) {
		if(a[i] > largest) {
			largest = a[i];
		}else {
			if(a[i] < smallest) {
				smallest = a[i];
			}
		}
	}
	System.out.println("Difference of Largest and Smallest value is "+(largest-smallest));
}
}
