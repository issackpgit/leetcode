package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import practice.Graph.Edge;

public class Kruskal {
	
	DisjointSet d = new DisjointSet();
	
	public static void main(String args[]) {
		Graph graph = new Graph(4,5);
		Kruskal k = new Kruskal();
		DisjointSet d = new DisjointSet();
		
		// add edge 0-1 
        graph.edge[0].v = 0; 
        graph.edge[0].e = 1; 
        graph.edge[0].weight = 10; 
  
        // add edge 0-2 
        graph.edge[1].v = 0; 
        graph.edge[1].e = 2; 
        graph.edge[1].weight = 6; 
  
        // add edge 0-3 
        graph.edge[2].v = 0; 
        graph.edge[2].e = 3; 
        graph.edge[2].weight = 5; 
  
        // add edge 1-3 
        graph.edge[3].v = 1; 
        graph.edge[3].e = 3; 
        graph.edge[3].weight = 15; 
  
        // add edge 2-3 
        graph.edge[4].v = 2; 
        graph.edge[4].e = 3; 
        graph.edge[4].weight = 4; 
        
        Arrays.sort(graph.edge);
        
        k.findKruskal(graph);
		
	}

	private void findKruskal(Graph g) {
		
		for(int i =0 ; i<g.V;i++) {
			d.makeSet(i);
		}
		
		ArrayList result = new ArrayList();
		for(Edge ed: g.edge) {
			if(d.findSet(ed.v)!=d.findSet(ed.e)) {
				d.union(ed.v, ed.e);
				result.add(ed);
			}
			
		}
	}
	

}
