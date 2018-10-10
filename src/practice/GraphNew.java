package practice;
import java.util.*;

public class GraphNew {
	int V, E;
	boolean isDirected;
	
	LinkedList<Edge> adj[];
	
	public GraphNew(int v, boolean dir){
		this.V=v;
		this.isDirected = dir;
		adj = new LinkedList[V];

		
		for(int i =0;i<V;i++) {
			adj[i] = new LinkedList<Edge>();
		}
		
		
	}
	
	public void addEdge(int src, int dest, int weight) {
		Edge e = new Edge(src, dest, weight);
		if(isDirected) {
			adj[src].add(e);
		}
		else {
			adj[src].add(e);
			Edge e1 = new Edge(dest, src, weight);
			adj[dest].add(e1);
		}
		
	}
	
	public LinkedList<Edge> getAdj(int v) {
		return adj[v];
	}
	
	public class Edge {
		int src,dest,weight;
		public Edge(int src, int dest, int weight){
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}

}


