package ArrayList;

public class Spiral {
	
	public static void main(String [] args) {
	  int [][] arr= new int[4][5];
	  int counter =1;
	  
	  
	  for(int i=0;i<arr.length;i++) {
		  for(int j=0;j<arr[i].length;j++) {
			  System.out.print(arr[i][j]); 
		  }
		  System.out.println();
	  }
	  	int top=0,bottom=arr.length-1,left=0,right= arr[top].length-1,dir=1;
	  	int count=(bottom+1)*(top+1);
	  	
	  	while(top<=bottom && left<= right) {
	  		if(count>0) {
	  			dir=1;
		  		if(dir ==1) {
		  			for(int i=left;i<=right;i++) {
		  				System.out.println(arr[top][i]);
		  				count--;
		  				
		  			}
		  			top++;
		  			dir++;
		  			
		  		}
	  		}
	  		if(count>0) {
	  			if(dir ==2) {
		  			for(int i=top;i<=bottom;i++) {
		  				System.out.println(arr[i][right]);
		  				count--;
		  				
		  			}
		  			right--;
		  			dir++;
		  		}
	  		}
		  		
		  	if(count>0) {
		  		if(dir ==3) {
		  			for(int i=right;i>=left;i--) {
		  				System.out.println(arr[bottom][i]);
		  				count--;
		  			}
		  			dir++;
		  			bottom--;
		  		}
		  	}	
		  		
		  	if(count>0) {
		  		if(dir ==4) {
		  			for(int i=bottom;i>=top;i--) {
		  				System.out.println(arr[i][left]);
		  				count--;
		  			}
		  			dir++;
		  			left++;
	  		}
		  		}
		  		
		  	
	  		}
	  		
	  	
	  	
	  
	}

}
