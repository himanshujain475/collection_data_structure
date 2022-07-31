package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public class Permutation {
//	
//	static List<String> getPermutations(String str){
//		
//		if(str.length() ==1) {
//			List<String> intialArray = new ArrayList<>();
//			intialArray.add(str);
//			return intialArray;
//		}
//		List<String> finalList= new ArrayList<>();
//		String ch = str.substring(0,1);
//		
//		List<String> list = getPermutations(str.substring(1));
//		
//		for(int i=0;i<list.size();i++) {
//			String s = list.get(i);
//			for(int j=0;j<=s.length();j++) {
//				finalList.add(s.substring(0,j)+ch+s.substring(j));
//			}
//		}
//		
//		
//		return finalList;
//	}
//	
//	public static void main(String [] args) {
//		List<String> array = getPermutations("abc");
//		
//		System.out.print(array);
//	}
//
//}



public class Permutation {
    public static void printPermutation(String ques, String ans, String orig) {
        // Base Case
        if (ques.length() == 0) {
            // If the ans is Lexicographically Smaller then print
        	 System.out.println(ans + " ");
//            if (ans.compareTo(orig) < 0) {
//                System.out.println(ans + " ");
//            }
            return;
        }
        // Same code as that of print Permutations
        int cnt = 0;
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i + 1);
            printPermutation(roq, ans + ch, orig);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String orig = sc.next();
        String orig ="cat";
        char[] temp = orig.toCharArray();
        Arrays.sort(temp);
        String ques = new String(temp);
        printPermutation(ques, "", orig);
    }
}
