package practice;

import java.util.Iterator;
import java.util.LinkedList;

import practice.Graph;

public class BFS {
	private int V = 4;
	public static void main(String args[]) {
		Graph g = new Graph(4);
		BFS b = new BFS();
		
		 	g.addEdge(0, 1); 
	        g.addEdge(0, 2); 
	        g.addEdge(1, 2); 
	        g.addEdge(2, 0); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 3); 
	       
	        b.BFS(2,g);
	}

	private void BFS(int i, Graph g) {

		boolean visited[] = new boolean[V];
		
        LinkedList<Integer> queue = new LinkedList<Integer>(); 

        visited[i] = true;
        queue.add(i);
        
        while(!queue.isEmpty()) {
        		i = queue.poll(); 
            System.out.print(i+" ");
            
            Iterator<Integer> it = g.getAdj(i).listIterator(); 
            while(it.hasNext()) {
            	 int v = it.next();
            	 if(!visited[v]) {
            	 visited[v]=true;
            	 queue.add(v);
            }
            }
   
        }
        
		
	}
	
	
}
