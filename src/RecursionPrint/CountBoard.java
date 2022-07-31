package RecursionPrint;

public class CountBoard {
	
	
	public static void countBoard(int start,int end, String result) {
		
		if(start==end) {
			System.out.println(result);
			return ;
		}
		
		if(start>end) {
			return;
		}
		
		
		for(int dice=1;dice<=6;dice++) {
			
			countBoard(start+dice,end,result+dice);
			
		}
	}
	
	public static void main(String [] args) {
		countBoard(0,10,"");
	}

}
