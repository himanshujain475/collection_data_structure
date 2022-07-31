package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//public class CBNumbers {
//	public static void main(String args[]) {
//		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13,17,19,23,29));
//		Scanner sc = new Scanner(System.in);
//		
//		int n =sc.nextInt();
//		String s = sc.next();
//		List<Integer> str = new ArrayList<>();
//
//		for(int i=0;i<n;i++){
//			for(int j=i;j<n;j++){
//				int no =0;
//				if(j==i){
////					if(i+1<n){
//						no = Integer.parseInt(s.substring(i,i+1));
////					}
////					else{
////						no = Integer.parseInt(s.substring(i));
////					}
//					
//					
//				}
//				else{
////					if(j+1<n){
//					no = Integer.parseInt(s.substring(i,j+1));
////					}
////					else{
////						no = Integer.parseInt(s.substring(j));
////					}
//					 
//				}
//
//				boolean checker=	condtionsToBeTrue(no,arr);
//				if(checker){
//					str.add(no);
//					i=j;
//					break;
//				}
//			}
//		}
//		
//		System.out.println(str.size());
//    }
//
//	static boolean condtionsToBeTrue(int no,List<Integer> arr){
//
//		if( no ==1 || no ==0){
//			return false;
//		}
//		if(arr.contains(no)){
//			return true;
//		}
//		for(Integer a: arr){
//			if(no%a==0){
//				return false;
//			}
//		}
//
//		return true;
//
//	}
//}

public class CBNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        scn.nextInt();
        String str = scn.next();
        int count = 0;
        boolean[] visited = new boolean[str.length()];

        for (int len = 1; len <= str.length(); len++) {

            for (int si = 0; si <= str.length() - len; si++) {

                int ei = si + len;

                String ss = str.substring(si, ei);

                if (isCBNo(Long.valueOf(ss)) && isValid(visited, si, ei)) {

                    count++;

                    for (int i = si; i < ei; i++) {
                        visited[i] = true;
                    }

                }
            }

        }

        System.out.println(count);

    }

    public static boolean isValid(boolean[] visited, int start, int end) {

        for (int i = start; i < end; i++) {
            if (visited[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isCBNo(long n) {

        if (n == 0 || n == 1) {
            return false;
        }

        long[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };

        for (int i = 0; i < arr.length; i++) {
            if (n == arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }

  }


