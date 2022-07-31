package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CountBoard {
	
	public static List<String> getMaze(int curr,int end){
		
		if(curr == end) {
			List<String> current= new ArrayList<>();
			current.add(" ");
			return current;
		}
		
		if(curr>end) {
			return new ArrayList<>();
			
		}
		List<String> mr = new ArrayList();
		
		for(int dice=1;dice<=6;dice++) {
			List<String> rrs = getMaze(curr+dice,end);
			
			for(String rr:rrs) {
				mr.add(rr+dice);
			}
			
		}
		return mr;
	}
	
	public static void main(String[] args) {
		
		List<String> count = getMaze(0,10);
		
		System.out.print(count);
		
		
	}

}
