package Searching;

public class InterpolationSearch {
	
	static int searchInterpolation(int arr[],int search) {
		int low =0;
		int high =arr.length-1;
		
		while(low<=high && arr[low] <=search && arr[high]>=search) {
			if(low ==high) {
				if(arr[low] == search) return low+1;
				return -1;
			}
			
			int pos = low+ (((search - arr[low])/(arr[high] -arr[low])))   *(high -low);
			if(arr[pos] == search) {
				return pos+1;
			}
			if(arr[pos]<search) {
				low=pos+1;
			}
			else if(arr[pos]> search){
				high =pos-1;
			}
			
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {12,14,16,18,20,22,24,26,28};
		int search =20;
		int x = searchInterpolation(arr,search);
		System.out.print(x);
	}

}
