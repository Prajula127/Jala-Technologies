package arrays;

//a function to add integer values of an array
public class AddIntegerValues {

	public static void main(String[] args) {

		int a[] = {2,5,6,8,1};
		int sum = 0;
		add(a,sum);
	}
	public static void add(int a[], int sum) {
		
		for(int i=0; i<a.length; i++) {
			sum = sum+a[i];
		}
		System.out.println("Add Integer Values of an Array : "+sum);
	}
}