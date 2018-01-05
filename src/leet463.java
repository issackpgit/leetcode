//Author : Issac Koshy Panicker
//04-01-2018

import java.io.*;

class Solution463 {
    public int islandPerimeter(int[][] grid) {
    
    	int m = grid.length;
    	int n = grid[0].length;	
	int count = 0;
	
	int p=0;
	
	for(int i = 0; i<m ;i++) {
		for(int j = 0; j<n ; j++) {
			count =0;
			if(grid[i][j]==1) {
				if (i>0 && grid[i - 1][j]==1)
			        count++;
			    if (j > 0 && grid[i][j - 1]==1)
			        count++;
			    if (i < m-1 && grid[i + 1][j]==1)
			        count++;
			    if (j < n-1 && grid[i][j + 1]==1)
			        count++;
			    
			    p+=4-count;
			}
			
			
			}
		}

return p;
	
    }
}

public class leet463{
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
        
        int ret = new Solution463().islandPerimeter(a);
        
        System.out.println(ret);
        
        
        
	}
	
}

