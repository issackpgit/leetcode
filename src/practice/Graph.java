package practice;

import java.util.*;

public class Graph {
	int V;
	LinkedList adj[];
	
	Map<Edge, Integer> edges = new HashMap<Edge, Integer>();
	
	Graph(int v){
		V=v;
		adj = new LinkedList[V];
		
		for(int i =0;i<V;i++) {
			adj[i] = new LinkedList();
		}
	}
	
	int E;
	Edge edge[];
	Graph(int v, int e){
		V=v;
		E=e;
		adj = new LinkedList[V];
		
		for(int i =0;i<V;i++) {
			adj[i] = new LinkedList();
		}
		
		edge = new Edge[E];
		
		for(int i = 0 ;i<E;i++) {
			edge[i] = new Edge();
		}
		
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void addEdge(int v,int w, int weight) {
		adj[v].add(w);
		Edge ed = new Edge(v,w);
//		ed.v = v;
//		ed.e = w;
////		ed.weight = weight;
		edges.put(ed, weight);
		
	}
	
	public LinkedList getAdj(int v) {
		return adj[v];
	}
	
	public class Edge implements Comparable<Edge>{
		int v,e, weight;
		
		public Edge() {
			
		}
		
		public Edge(int v, int e) {
			this.v = v;
			this.e = e;
		}
		
		public int compareTo(Edge s) {
			return this.weight-s.weight;	
		}
	}
}
