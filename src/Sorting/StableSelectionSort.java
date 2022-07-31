package Sorting;

public class StableSelectionSort {
	
	public static void main(String[] args) {
		
		int arr[] = {64,25,12,22,11};
		
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min =j;
				}
			}
			//instead of swapping we will put index there.
			int key = arr[min];
			while(min>i) {
				arr[min] = arr[min-1];
				min--;
			}
			arr[i] = key;
		}
		//print array
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
