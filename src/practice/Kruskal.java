package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

import practice.Graph.Edge;

public class Kruskal {
	
	DisjointSet d = new DisjointSet();
	ArrayList result = new ArrayList();

	
	public static void main(String args[]) {
		Graph graph = new Graph(6,9);
		Kruskal k = new Kruskal();
		DisjointSet d = new DisjointSet();
		
		// add edge 0-1 
        graph.edge[0].v = 0; 
        graph.edge[0].e = 1; 
        graph.edge[0].weight = 3; 
  
        // add edge 0-2 
        graph.edge[1].v = 1; 
        graph.edge[1].e = 2; 
        graph.edge[1].weight = 1; 
  
        // add edge 0-3 
        graph.edge[2].v = 1; 
        graph.edge[2].e = 3; 
        graph.edge[2].weight = 3; 
  
        // add edge 1-3 
        graph.edge[3].v = 2; 
        graph.edge[3].e = 3; 
        graph.edge[3].weight = 1; 
  
        // add edge 2-3 
        graph.edge[4].v = 0; 
        graph.edge[4].e = 3; 
        graph.edge[4].weight = 1; 
        
        graph.edge[5].v = 3; 
        graph.edge[5].e = 4; 
        graph.edge[5].weight = 6; 
        
        graph.edge[6].v = 2; 
        graph.edge[6].e = 4; 
        graph.edge[6].weight = 5; 
        
        graph.edge[7].v = 2; 
        graph.edge[7].e = 5; 
        graph.edge[7].weight = 4; 
        
        graph.edge[8].v = 4; 
        graph.edge[8].e = 5; 
        graph.edge[8].weight = 2; 
        
        Arrays.sort(graph.edge);
        
        k.findKruskal(graph);
        
        System.out.println(k.result);
        
		
	}

	private void findKruskal(Graph g) {
		
		for(int i =0 ; i<g.V;i++) {
			d.makeSet(i);
		}
		
		for(Edge ed: g.edge) {
			if(d.findSet(ed.v)!=d.findSet(ed.e)) {
				d.union(ed.v, ed.e);
				result.add(ed);
			}
			
		}
	}
	

}
