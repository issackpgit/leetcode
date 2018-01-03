import java.io.*;

class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	
    	int[][] ret = new int[r][c];
    	
    	 int m = nums.length;
    	 int n = nums[0].length;
    	 int k =0;
    	 
    	 if(m*n!=r*c) return nums;
    	 
    	 int[] temp = new int[m*n];
    	 
    	 for(int i=0;i<m;i++) {
    		 for(int j=0;j<n;j++) {
    			 temp[k] = nums[i][j];
    			 k++;
    		 }
    	 }
    	 
    	k=0; 	 
    	 for(int i = 0; i<r;i++) {
    		 for(int j =0;j<c;j++) {
    			 ret[i][j] = temp[k];
    			 k++;
    		 }
    	 }
       
    	return ret;
    	
    }
}

public class leet566{
	 public static void main(String[] args) throws IOException {
	        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        
	        int m = Integer.parseInt(in.readLine());
	        int n = Integer.parseInt(in.readLine());
	        int a[][]= new int[m][n];
	        for(int i=0;i<m;i++) {
	        	for(int j = 0;j<n;j++) {
	        		a[i][j]= Integer.parseInt(in.readLine());
	        	}
	        }
	        int r = Integer.parseInt(in.readLine());
	        int c = Integer.parseInt(in.readLine());	        
	        
	        int[][] ret = new Solution566().matrixReshape(a,r,c);
	        
	        for(int i=0;i<r;i++) {
	        	for(int j = 0;j<c;j++) {
	        		System.out.println(ret[i][j]);
	        	}
	        }
	        
}
}

