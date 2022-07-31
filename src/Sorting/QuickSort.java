package Sorting;


public class QuickSort {
	
	public static void main(String[] args) {
		
		int arr[]= {12,2,15,10,3,4};
		
		quickSort(arr,0,arr.length);
		
		System.out.println("I ma here");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	static int partition(int arr[],int low, int high) {
		System.out.println("I am struck");
		int pivot= arr[low];
		int i=low, j= high;
		while(i <j) {
			do {
				i++;
			}
			while(i< arr.length-1 &&arr[i]<=pivot);
			
			do {
				j--;
			}
			while(arr[j]>pivot &&j>0);
			if(i<j) {
				swap(arr,i,j);
			}
				
		}
		swap(arr,low,j);
		System.out.print("I am out");
		
		return j;
		
	}
		
		
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	static void quickSort(int arr[], int low, int high){
		
		if(low<high) {
			int par= partition(arr,low,high);
			quickSort(arr,low,par);
			quickSort(arr,par+1,high);
			
		}
		
	}
	

}
