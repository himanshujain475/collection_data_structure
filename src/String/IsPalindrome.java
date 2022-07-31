package String;

public class IsPalindrome {
	public static void main(String [] args) {
		int x=121;
		  int n =0;
	        int sum =x;
	        while(x>0){
	            int digit = x%10;
	            n =digit+n*10;
	            x =x/10;
	        }
	        if(n==sum){
	            System.out.println(true);
	        }
	        System.out.println(false);
	}
}
