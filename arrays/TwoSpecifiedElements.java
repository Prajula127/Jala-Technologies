package arrays;
//Write a method to verify if the array contains two specified elements(12,23)
public class TwoSpecifiedElements {
	
public static void main(String[] args) {
	int a[] = {12, 12, 23, 12, 23, 12};
    int num1 = 12;
	int num2 = 23;
System.out.println(TwoSpecifiedElementsAre(a, num1, num2));
	}

public static boolean TwoSpecifiedElementsAre(int[] a, int num1, int num2) {
	for(int num : a) {
		if(num != num1 && num != num2) {
			return false;
		}
	}
	return true;
}
	}


