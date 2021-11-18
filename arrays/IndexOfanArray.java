package arrays;

//a program to find the index of an array element
public class IndexOfanArray {

	public static void main(String[] args) {

		int a[] = {1, 2, 3, 4, 5, 6};
		int index = -1;
		int element = 3;
	
	 int i=0;
	 while(i < a.length) {
		 if(a[i] == element) {
			 index = i;

		 }
      i++;
}
	 System.out.println("Index position of 3 is " +index); 
}
}
