package arrays;

//a function to calculate the average value of an array of integers
public class CalculateAverage {

	public static void main(String[] args) {

		int a[] = {2,5,6,8,1};
		int sum = 0;
		float average = 0;
		calculateAverage(a,sum,average);
	}
	public static void calculateAverage(int a[], int sum, float average) {
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		average = sum/a.length;
		System.out.println("Add Integer Values of an Array : "+average);
	}
}
