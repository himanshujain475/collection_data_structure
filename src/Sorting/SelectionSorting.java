package Sorting;

public class SelectionSorting {
	
	public static void main(String [] args) {
		int arr[] = {64,25,12,22,11};
		
		for(int i=0;i<arr.length-1;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min =j;
				}
			}
			int swap = arr[i];
			arr[i] = arr[min];
			arr[min] = swap;
		}
		//print array
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
