//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;

class Solution661 {
    public int[][] imageSmoother(int[][] M) {
    	
    int m = M.length;
    	int n = M[0].length;	
    	
    	int[][] out = new int[m][n];
    	
    	int[] row = {0,-1, -1, -1, 0, 0, 1, 1, 1};
    	int[] col = {0,-1, 0, 1, -1, 1, -1, 0, 1};
    	
    	int sum =0;
    	int count = 0;
    	
    	for(int i =0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			for(int k = 0; k<row.length;k++) {
    				if(i+row[k]>=0 && j+col[k]>=0 && i+row[k]<m && j+col[k]<n) {
    				sum+=M[i+row[k]][j+col[k]];	
    				count++;
    				}
    			}
    				int avg = sum/count;
    				out[i][j]=avg;
    				sum=0;
    				count = 0;
    			
    		}
    	}
     
    	return out;
    }
    
}

public class leet661{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int m = Integer.parseInt(in.readLine());
        int n = Integer.parseInt(in.readLine());
        int a[][]= new int[m][n];
        for(int i=0;i<m;i++) {
        	for(int j = 0;j<n;j++) {
        		a[i][j]= Integer.parseInt(in.readLine());
        	}
        }
        
        int[][] ret = new Solution661().imageSmoother(a);
        
        for(int i=0;i<m;i++) {
        	for(int j = 0;j<n;j++) {
        		 System.out.println(ret[i][j]);
        	}
        }
       
        
	}
}
