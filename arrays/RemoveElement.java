package arrays;

//a function to remove a specific element from an array

public class RemoveElement {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
        int b[] = null;
		int removeindex = 2;
		removeElement(a,removeindex,b);
	}
		public static void removeElement(int a[], int removeindex,int[] b) {
		System.out.print("Given Array ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");

			if(a[i] == removeindex) {
			 b = new int[a.length - 1];
		for(int index=0; index<i; index++) {
			b[index] = a[index];

		}
		for(int j=i; j<a.length-1; j++) {
			b[j] = a[j+1];

		}
			}
		}
		System.out.println();
		System.out.println("remove element "+ removeindex);

		System.out.print("After Removing ");
		for(int i=0; i<b.length; i++) {
		System.out.print(b[i]+" ");
	}
	}
}
