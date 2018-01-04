//Author : Issac Koshy Panicker
//03-01-2018

import java.io.*;

class Solution695 {
    public int maxAreaOfIsland(int[][] grid) {
    
    	int m = grid.length;
    	int n = grid[0].length;
    int max = 0;
    int[] s = {1};
    int flag =0;
    
    	boolean[][] visited = new boolean[m][n];
    	
    	for(int i = 0; i<m ;i++) {
    		for(int j = 0; j<n ; j++) {
    			if(grid[i][j]==1 && !visited[i][j]) {
    				flag=1;
    				DFS(grid,i,j,visited,s);
    				if(s[0]>max)
    					max =s[0]; 
    				s[0]=1;
    			}
    		}
    	}

    	if(flag == 0) return flag;
    	else
    	return max;
    }
    
    public void DFS(int[][] grid, int i, int j, boolean[][] visited, int[] s) {
    	
    	int[] row = {-1,0,0,1};
    	int[] col = {0,-1,1,0};
    	int m = grid.length;
    	int n = grid[0].length;
    	
    	visited[i][j] = true;
    	
    	for(int k = 0; k<row.length;k++) {
    		if(i+row[k]>=0 && j+col[k]>=0 && i+row[k]<m && j+col[k]<n && grid[i+row[k]][j+col[k]]==1 && !visited[i+row[k]][j+col[k]]) {
    			s[0]+=1;
    			DFS(grid,i+row[k],j+col[k],visited,s);
    		}
    	}
    }
}

public class leet695{
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
        
        int ret = new Solution695().maxAreaOfIsland(a);
        
        System.out.println(ret);
        
        
        
	}
	
}

