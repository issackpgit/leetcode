package practice;

import java.util.LinkedList;

public class Graph {
	int V;
	LinkedList adj[];
	
	Graph(int V){
		adj = new LinkedList[V];
		
		for(int i =0;i<V;i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	public LinkedList getAdj(int v) {
		return adj[v];
	}
}
