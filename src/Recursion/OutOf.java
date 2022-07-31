package Recursion;

public class OutOf {
	
	public static void main(String[] args) {
		int N=2,i=0,j=0,m=2,n=3;
		 if (N <= 0) 
			 {
			 
			 }
		
		 else {
			  final int MOD = 1000000007;
		        int[][] count = new int[m][n];
		       count[i][j] = 1;
		        int result = 0;
		        
		        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		        
		        for (int step = 0; step < N; step++) {
		            int[][] temp = new int[m][n];
		            for (int r = 0; r < m; r++) {
		                for (int c = 0; c < n; c++) {
		                    for (int[] d : dirs) {
		                        int nr = r + d[0];
		                        int nc = c + d[1];
		                        if (nr < 0 || nr >= m || nc < 0 || nc >= n) {
		                            result = (result + count[r][c]) ;
		                        }
		                        else {
		                            temp[nr][nc] = (temp[nr][nc] + count[r][c]);
		                        }
		                    }
		                }
		            }
		            count = temp;
		        }
		        
		        System.out.println(result);

		 }
	        
	      	}

}
