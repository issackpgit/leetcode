package practice;

import java.util.LinkedList;


public class DFSGraph{

//	public class Graph{
	
			int V; 
	        LinkedList<Integer> adjListArray[];		
	
	        DFSGraph(int V) 
	        { 
	            this.V = V;
	            adjListArray = new LinkedList[V]; 
	
	            for(int i = 0; i < V ; i++){ 
	                adjListArray[i] = new LinkedList<>(); 
	            } 
	            
	        }
	        
	        void addEdge(int v, int w) 
	        { 
	        		adjListArray[v].add(w);  
	        } 
//		}	
	
	 public static void main(String args[]) 
	    { 
	        DFSGraph g = new DFSGraph(4); 
	        
	        g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	        
	        g.DFS(2);
	    }

	void DFS(int i) {
		// TODO Auto-generated method stub
		
		boolean visited[] = new boolean[V];
		
		DFSUtil(i, visited);
		
	}

	private void DFSUtil(int i, boolean[] visited) {
		
		visited[i] = true;
		System.out.println(i+" ");
		for (int temp : adjListArray[i]) {
		    if(!visited[temp])
		    	DFSUtil(temp, visited);
		}
		
	}

}