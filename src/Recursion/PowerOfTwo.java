package Recursion;

public class PowerOfTwo {
	class Solution {
	    public boolean isPowerOfTwo(int n) {
	        if(n == 0){
	            return false;
	        }
	        
	        if(n==1){
	            return true;
	        }
	       boolean checker ;
	        if(n%2 ==0){
	            checker= isPowerOfTwo(n/2); 
	           
	        }
	        else{
	            return false;
	        }
	        return checker;
	       
	      
	    }
	}
}
