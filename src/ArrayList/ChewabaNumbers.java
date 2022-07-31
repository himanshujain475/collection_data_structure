package ArrayList;

import java.util.Scanner;

public class ChewabaNumbers {
	
	public static void main(String args[]) {
		Scanner   sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		String finalAnswer="";
		for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		 int k = ch - '0';
			if(i==0 ){
				if(k!=9) {
					if(k<5){
						finalAnswer = finalAnswer+k;
					}
					else{
						int l =(9-k);
						finalAnswer = finalAnswer +l;
					}
				}
				else {
					finalAnswer = finalAnswer+ k;
				}
				
			}
			else{
				if(k<5){
					finalAnswer = finalAnswer+k;
				}
				else{
					int l =(9-k);
					finalAnswer = finalAnswer +l;
				}
			}
		}
		System.out.println(finalAnswer);

        // Your Code Here
    }

}
