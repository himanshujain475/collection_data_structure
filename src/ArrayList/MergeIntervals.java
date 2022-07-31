package ArrayList;

//First Soln
////public int[][] merge(int[][] intervals) {
//
//int[][] newArray = new int[intervals.length][2];
//int counter = 0;
//  boolean checker = false;
//int startNo = intervals[0][0];
//int endNo = intervals[0][1];
//for(int i=0;i<intervals.length;i++){
//    
//    if(i+1<intervals.length && intervals[i+1][0]<=intervals[i][1]){
//        checker = true;
//        startNo = intervals[i][0];
//    }
//     int arr[] = new int[2];
//    if(checker){
//        endNo = intervals[i+1][1];
//        int l =i+1;
//        for(int j=i+1;j<intervals.length-1;j++){
//            if(intervals[j][1]<intervals[j+1][0]){
//                endNo= intervals[j][1];
//                
//                l=j;
//                   break; 
//                
//            }
//            
//        }
//        checker =false;
//         arr[0] = startNo;
//	        arr[1] = endNo;
//            newArray[counter] = arr;
//            counter++;
//        i=l--;
//    }
//    else{
//      
//            arr[0] = intervals[i][0];
//	        arr[1] = intervals[i][1];
//            newArray[counter] = arr;
//            counter++;
//    }
//    
//}
//  int co[][] = new int[counter][2];
//  for(int i=0;i<counter;i++){
//      co[i] = newArray[i];
//  }
//return co;
//  
//
//}


public class MergeIntervals {
//    public int[][] merge(int[][] intervals) {
//        
////        int[][] newArray = new int[intervals.length][2];
////        int counter = 0;
////        int startNo = intervals[0][0];
////        int endNo = intervals[0][1];
////        for(int i=1;i<intervals.length;i++){
////          
////          if(endNo>=intervals[i][0]) {
////        	  endNo= intervals[i][1];
////          }
////          else {
////        	  int arr[] = new int[2];
////        	  arr[0] = startNo;
////        	  arr[1] = endNo;
////        	  newArray[counter] = arr; 
////        	  counter++;
////        	  if(i<.length) {
////        		  startNo = intervals[i+1][0];
////        		  endNo = intervals[i+1][0];
////        	  }
////          }
////        }
////		return newArray;
//        
//    }
//
}
