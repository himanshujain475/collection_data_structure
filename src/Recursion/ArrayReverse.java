package Recursion;

public class ArrayReverse {
	
	static void  arrayReverse(int []arr,int start,int end) {
		if(arr.length %2==0) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			if(start<=end) {
				arrayReverse(arr,start+1,end-1);
			}
		}
		
		else {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			if(!(start==end)) {
				arrayReverse(arr,start+1,end-1);
			}
		}
		
		
		
		
	}
	
	
	static void  arrayReverse1(int []arr,int start,int end) {
		
		if(start>=end)
			return ;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		arrayReverse1(arr, start+1, end-1);
		
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,7};
		
		arrayReverse1(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
		
	}

}
