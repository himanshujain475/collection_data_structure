package Recursion;

public class StringToInt {
	
	public static int returnString(String str,int i){
		
		if(str.length() ==0){
			return 0;
		}
		int len = str.length();
		char n = str.charAt(len-1);
		str = str.substring(0,len-1);
		int a = n -'0';
		int no = (int) (a*Math.pow(10, i));
		int sum = returnString(str,i+1);
		return sum +no;	
	}

	public static void main(String[] args) {
		String str ="1230478";
		System.out.print(returnString(str,0));
	}
	
	

}
