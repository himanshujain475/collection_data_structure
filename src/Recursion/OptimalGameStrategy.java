package Recursion;

public class OptimalGameStrategy {
	
	static int optimalGameStrategy(int arr[],int i,int j, int checker) {
		if(checker == arr.length) {
			return 0;
		}
		int sum =0;
		if(arr[i]>=arr[j] ) {
			if(checker%2!=0) {
				sum=optimalGameStrategy(arr,++i,j,++checker);
				
			}
			else {
				int value = arr[i];
				sum = optimalGameStrategy(arr,++i,j,++checker)+ value;
			}
			
					
			
		}
		else if(arr[i]<arr[j] ) {
			if(checker%2!=0) {
			sum=	optimalGameStrategy(arr,i,--j,++checker);
				
			}
			else {
				int value = arr[j];
				sum= optimalGameStrategy(arr,i,--j,++checker) + value;
			}
			
					
			
		}
		return sum;
		
	}

	public static void main(String [] args) {
		
		int arr[] = {2396,25316,30085,23080,10269,5711,8306,11536,19092,6816,6305,23649,32583,5585,14193,14859,30265,18026,5528,16126,15212,25591,14789,3900,31395,25529};
		int sum =	optimalGameStrategy(arr,0,arr.length-1,0);
		System.out.print(sum);
	}
}
