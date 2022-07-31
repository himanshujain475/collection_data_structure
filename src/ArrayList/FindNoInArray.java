package ArrayList;

import java.util.Scanner;

public class FindNoInArray {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		int no= scanner.nextInt();
		int arr[][] = new int[no][];
		String answer[] = new String[no];
		for(int i=0;i<no;i++) {
			int n= scanner.nextInt();
			arr[i] = new int[n];
			arr [i]= enterNo(n);		
			answer[i]=sortNo(arr[i]);
			
		}
		
		for(int i=0;i<no;i++) {
			System.out.println(answer[i]);
		}
		
	}
	
	static String sortNo(int arr[]) {
		String str="";
		int counter = arr.length-1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(compareNo(arr[j],arr[j+1])>1) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			str= str+arr[counter];	
			counter--;
		}
		return str;
	}
	
	static int compareNo(int no, int no1) 	{
		int val1 =Integer.valueOf( no+""+no1);
		int val2 = Integer.valueOf(no1+""+no);
		
		if(val1>val2) {
			return -1;
		}
		else {
			return 1;
		}
		
		
		
	}
	
	
	static int[] enterNo(int n) {
		int arr[] = new int[n];
		 Scanner scanner = new Scanner(System.in);
		for(int j=0;j<n;j++) {
			arr[j] = scanner.nextInt();
		}
		return arr;
	}
	
	
	
	
	
	
	
}
