package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripleSum {
	
	public static void main(String [] args) {
		
		int arr[] = {5, 7, 9, 1, 2, 4, 6 ,8 ,3};
		int target =10;
		List<String> str = new ArrayList<>();
		
		for(int i=0;i<arr.length-2;i++) {
			int ans = arr[i];
			if(arr[i]>= target) {
				continue;
			}
			else {
				
				int sum = target -arr[i];
				Map<Integer,Integer> map = new HashMap<Integer,Integer>();
				
				for(int j=i+1;j<arr.length;j++) {
					if(map.containsKey(sum-arr[j])) {
						String s = arr[i] +", "+ (sum-arr[j])+ " and "+arr[j];
						str.add(s);
					}
					map.put(arr[j], i);
				}
			}
			
			
		}
		
		for(String s: str) {
			System.out.println(s);
		}
	}

}
