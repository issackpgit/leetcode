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
	
	int E;
	Edge edge[];
	Graph(int V, int E){
		edge = new Edge[E];
		
		for(int i = 0 ;i<E;i++) {
			edge[i] = new Edge();
		}
		
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	public LinkedList getAdj(int v) {
		return adj[v];
	}
	
	public class Edge implements Comparable<Edge>{
		int v,e, weight;
		
		public int compareTo(Edge s) {
			return this.weight-s.weight;	
		}
	}
}
