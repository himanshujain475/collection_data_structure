package RecursionPrint;

import java.lang.reflect.Array;

public class CountNQueens {
	
	static int countQueens(boolean [][]arr,int row) {
		
		if(row == arr.length) {
			return 1;
		}
		int count =0;
		
		for(int col=0;col < arr[row].length ;col++) {
			
			if(isItSafe(arr,row,col)) {
				arr[row][col] = true;
				count = count + countQueens(arr,row+1);
				arr[row][col] =false;
				
			}
			
		}
		
		
		return count;
	}
	
	static boolean isItSafe(boolean arr[][],int row,int col) {
		
		for(int i=row-1;i>-1;i--) {
			if(arr[i][col]) {
				return false;
			}
			
			
		}
		
		int i=row-1,j=col+1;
		while(j<arr[row].length && i>=0) {
			if(arr[i][j]) {
				return false;
			}
			i=i-1;
			j=j+1;
			
		}
		 i=row-1;j=col-1;
		while(j>=0&&i>=0) {
			if(arr[i][j]) {
				return false;
			}
			i=i-1;
			j=j-1;
			
		}
		
		
		return true;
	}
	
	public static void main(String [] args) {
		
		boolean arr[][] = new boolean[4][4];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = false;
			}
			
		}
		
		System.out.println(countQueens(arr,0));
		
		
		
	}

}
