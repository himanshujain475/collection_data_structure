package Recursion;

import java.util.ArrayList;
import java.util.List;

public class MazeDiagonal {
	
	public static List<String> getMazeDiagonal(int cr, int cc,int er,int ec){
		
		if(cc==ec && cr==er) {
			List<String> current = new ArrayList<>();
			current.add(" ");
			return current;
		}
		
		if(cc>ec || cr>er) {
			return new ArrayList<>();
		}
		
		
		List<String> finalList = new ArrayList<>();
		List<String> rrs= getMazeDiagonal(cr,cc+1,er,ec);
		
		for(String rr: rrs) {
			finalList.add("H"+rr);
		}
		
		List<String> crs= getMazeDiagonal(cr+1,cc,er,ec);
		
		for(String rr: crs) {
			finalList.add("V"+rr);
		}
		
		List<String> vrs= getMazeDiagonal(cr+1,cc+1,er,ec);
		
		for(String rr: vrs) {
			finalList.add("D"+rr);
		}
		
		
		return finalList;
	}
	
	
	
	public static void main(String[] args) {
		
		List<String> list = getMazeDiagonal(0,0,2,2);
		
		System.out.print(list);
	}

}
