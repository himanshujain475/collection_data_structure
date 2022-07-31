package GreedyAlgo;

public class ActivitySelectionProblem {
	
	static int findActivity(int []start,int[] end) {
		sortTheArray(start,end);
		
		int j=0;
		
		for(int i=1;i<end.length;i++) {
			if(start[i]>=end[j]) {
				System.out.println(start[i]+", "+end[i]);
				j=i;
			}
		}
		return 0;
	}
	
	static void sortTheArray(int []start,int[] end) {
		for(int i=0;i<end.length;i++) {
			for(int j=i+1;j<end.length;j++) {
				if(end[i]>end[j]) {
					int swap = start[i];
					start[i] = start[j];
					start[j] = swap;
					
					int swap2 = end[i];
					end[i] =end[j];
					end[j] = swap2;
				}
			}
		}
	}
	
	public static void main(String [] args) {
		int startTime[]= {0,3,1,5,5,8};
		int endTime[]= {6,4,2,9,7,9};
		
		int n=findActivity(startTime,endTime);
		
	}

}
