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
		edge = new Edge[E];
		
		for(int i = 0 ;i<E;i++) {
			edge[i] = new Edge();
		}
		
	}
	
	public void addEdge(int v,int w) {
		adj[v].add(w);
		Edge ed = new Edge();
		ed.v = v;
		ed.e = w;
		ed.weight = 0;
		edges.put(ed, ed.weight);
		
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
