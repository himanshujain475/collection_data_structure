package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsquenceRecursion {
	
	public static List<String> getSubSequence(String str){
		
		if(str.length() ==0) {
			List<String> array = new ArrayList<>();
			array.add("");
			return array;
		}
		
		String ch = str.substring(0, 1);
		
		List<String> returnArrayList = getSubSequence(str.substring(1));
		
		List<String> newList = new ArrayList();
		
		returnArrayList.forEach(element->{
			newList.add(element);
		});
		
		returnArrayList.forEach(element->{
			newList.add(ch+element);
		});
		
		return newList;
		
		
	}
	
	public static void	main(String[] args) {
		
		List<String> array = getSubSequence("abc");
		
		System.out.print(array);
		
	}

}
