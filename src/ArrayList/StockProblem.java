package ArrayList;

public class StockProblem {
	public static void main(String [] args) {
		int arr[] = {7,1,5,3,6,4};
		int i=0,j=1,max=0;
		while(i<arr.length && j< arr.length) {
			
			if(arr[j] >= arr[i]) {
				if(max<(arr[j]-arr[i])){
					max =arr[j]-arr[i];
				
				}
				j++;
			}
			if(arr[i]>arr[j]) {
				i=j;
				j++;
			}
			
			
		}
	}
}
