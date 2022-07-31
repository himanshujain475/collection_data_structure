package Recursion;

public class AllIndicesProblem {
	
	static void printIndices(int arr[],int counter,int search) {
		
		if(counter == arr.length) {
			return ;
		}
		
		if(arr[counter] ==search) {
			int originalIndice = counter+1;
			System.out.print(originalIndice+ " ");
		}
		
		printIndices(arr,++counter,search);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {2,3,2,4,5};
		printIndices(arr,0,2);
	}

}
