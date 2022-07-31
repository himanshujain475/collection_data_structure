package Recursion;

public class Power {
	
	public static int power(int x,int n){
		if(n==1) {
			return x;
		}
		int y= power(x,n-1);
		int fn = x*y; 
		return fn;
		
	}
	
	public static void main(String[] args) {
		
		int x = power(2,3);
		System.out.print(x);
	}

}
