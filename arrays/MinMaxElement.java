package arrays;

//a function to find the minimum and maximum value of an array
public class MinMaxElement {

	public static void main(String[] args) {

		int a[] = {2,3,5,15,10};
		minMaxElement(a);
	}
	public static void minMaxElement(int a[]) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Minimum Element is "+min);
		System.out.println("Maximum Element is "+max);

	}

}
