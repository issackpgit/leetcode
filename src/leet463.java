//Author : Issac Koshy Panicker
//04-01-2018

import java.io.*;

class Solution463 {
    public int islandPerimeter(int[][] grid) {
    
    	int m = grid.length;
    	int n = grid[0].length;	
	int neighbour = 0;
	
	int p=0;
	
	for(int i = 0; i<m ;i++) {
		for(int j = 0; j<n ; j++) {
			neighbour =0;
			if(grid[i][j]==1) {
				if (i>0 && grid[i - 1][j]==1)
			        neighbour++;
			    if (j > 0 && grid[i][j - 1]==1)
			        neighbour++;
			    if (i < m-1 && grid[i + 1][j]==1)
			        neighbour++;
			    if (j < n-1 && grid[i][j + 1]==1)
			        neighbour++;
			    
			    p+=4-neighbour;
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

