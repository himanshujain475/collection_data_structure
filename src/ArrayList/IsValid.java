package ArrayList;

public class IsValid {
	
	public static void main(String[] args) {
		String s ="\"()\"";
		 int start =0;
	        int end=s.length()-1;
	        while(start<end){
	        	char ch =s.charAt(start);
	        	char ch2 = s.charAt(end);
	        	if(!((ch =='(' && ch2 ==')') || (ch =='[' && ch2 ==']')||(ch =='{' && ch2 =='}')||Character.compare(s.charAt(start), s.charAt(end)) ==0) )
	            
	        	
	                System.out
	                .print(false);
	            
	            end--;
	            start++;
	        }
	        
	        System.out
            .print(true);
	}

}
