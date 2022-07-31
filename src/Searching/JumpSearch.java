package Searching;

public class JumpSearch {
	
	static void jumpSearch(int arr[],int search) {
		int gap = (int) Math.sqrt(arr.length);		
		int low =0;
		int high = gap;
		int searchIndex = -1;
		
		while(high <arr.length) {
			if(arr[high] == search) {
				searchIndex = high;
				System.out.println(high);
				low = arr.length;
				high = arr.length;
				break;
			}
			else if(search> arr[high]) {
				low = high;
				high = high +gap;
				
			}
			else {
				
				break;
				
			}
		}
		boolean checker = false;
		
		for(int i=low;i<high;i++) {
			if(search == arr[i]) {
				checker = true;
				System.out.print(i);
			}
		}
		
		
		
	}
	
	public static void main(String [] args) {
		int arr[]= {1,2,3,4,7,12,56,222,451,543};
		jumpSearch(arr,543);
	}

}
