package GitUploads;

import java.util.Arrays;

public class BubbleSort {
	
	int[] array= {4,3,5,2,9,7,1};
	
	public void sorting() {
		boolean swapping=true;
		
		while(swapping) {
			swapping=false;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				swapping=true;
				int temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		}
		}
		System.out.println(Arrays.toString(array));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BubbleSort object=new BubbleSort();
     object.sorting();
	}

}
