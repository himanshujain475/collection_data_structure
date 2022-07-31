package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MappedString {
	
	//Very bad logic
	
	public static void main(String[] args) {
		
	}
	
	void mappedString(String inp, String out) {
		
	}
}




//public static Map<String,String> createHashMap(){
//	
//	Map<String,String> map = new HashMap<String,String>();
//	
//	map.put("1", "A");
//	map.put("2", "B");
//	map.put("3", "C");
//	map.put("4", "D");
//	map.put("5", "E");
//	map.put("6", "F");
//	map.put("7", "G");
//	map.put("8", "H");
//	map.put("9", "I");
//	map.put("10", "J");
//	map.put("11", "K");
//	map.put("12", "L");
//	map.put("13", "M");
//	map.put("14", "N");
//	map.put("15", "O");
//	map.put("16", "P");
//	map.put("17", "Q");
//	map.put("18", "R");
//	map.put("19", "S");
//	map.put("20", "T");
//	map.put("21", "U");
//	map.put("22", "V");
//	map.put("23", "W");
//	map.put("24", "X");
//	map.put("25", "Y");
//	map.put("26", "Z");
//	
//	return map;
//}


//public static void main(String[] args) {
//	Map<String,String> map = createHashMap();
//	Scanner sc = new Scanner(System.in);
//	String str = sc.next();
//	List<String> arrayList = new ArrayList();
//	
//	for(int i=0;i<str.length();i++) {
//		String ans ="";
//		boolean print = true;
//		for(int j=0;j<str.length();j++) {
//			if(i==j) {
//				
//				int k = j+1;
//				if(k<str.length()) {
//					int combineLength = Integer.parseInt(str.substring(j, k+1));
//					if(combineLength>27) {
//							print = false;
//							break;
//					}
//					j++;
//					ans =ans+map.get(Integer.toString(combineLength));
//				}
//				else {
//					ans =ans+map.get(str.substring(j,j+1));
//				}
//				
//			}
//			else {
//				ans =ans+map.get(str.substring(j,j+1));
//			}
//		}
//		if(print) {
//			arrayList.add(ans);
//			
//		}
//	}
//	
//	for(int j= arrayList.size()-1;j>=0;j--) {
//		System.out.println(arrayList.get(j));
//	}
//}
//
