package RecursionPrint;

public class Permutations {
	
	static void getPermutations(String ques, String ans) {
		
		if(ques.equals("")) {
			System.out.println(ans);
			return;
		}
		
		
		
		for(int i=0;i<ques.length();i++) {
			//take out i character
			char ch = ques.charAt(i);
			
			//remove i th character
			String ris = ques.substring(0,i) +ques.substring(i+1);
			getPermutations(ris,ans+ch);
		}
			
		
	}
	
	public static void main(String[] args) {
		getPermutations("abc","");
	}

}
