package GitUploads;

import java.util.Arrays;
import java.util.Iterator;

public class InsertionSort {
static int arr[]= {3,1,6,7,9,2};

public void sorting() {
	for (int i = 1; i < arr.length; i++) {
		int currentValue=arr[i];
		
		int j=i-1;
		while(j>=0&&arr[j]>currentValue) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=currentValue;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InsertionSort object=new InsertionSort();
        object.sorting();
        System.out.println(Arrays.toString(arr));
		
		
	}

}
