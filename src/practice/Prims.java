package practice;

import java.util.Iterator;
import practice.Graph.Edge;

public class Prims {
	public int V;
	private Edge ed;
	
	public static void main(String args[]) {
		Prims p = new Prims();
		p.V = 5;
		Graph g = new Graph(p.V,7);
		
		g.addEdge(0, 1, 2);
		g.addEdge(1, 2, 3);
		g.addEdge(0, 3, 6);
		g.addEdge(3, 4, 9);
		g.addEdge(1, 3, 8);
		g.addEdge(2, 4, 7);
		g.addEdge(1, 4, 5);
		
		p.findMST(g);
	}
	
	private void findMST(Graph g) {
		int key[] = new int[V];
		int parent[] = new int[V];
		boolean mst[] = new boolean[V];
		
		for(int i =0;i< V;i++) {
			key[i] = Integer.MAX_VALUE;
		}
		
		
		key[0] = 0;
		
		for(int i = 0;i<V;i++) {
			int min = findMin(mst,key);
			mst[min] = true;
			
			Iterator<Integer> it = g.getAdj(min).iterator();
			while(it.hasNext()) {
				int p = it.next();
				Graph.Edge e = g.new Edge(min,p);
				if(g.edges.get(e)<key[min]) {
					key[min] = g.edges.get(e);
					parent[p] = min; 
				}				
			}
		}
		
	
	}

	private int findMin(boolean[] mst, int[] key) {
		int min =Integer.MAX_VALUE;
		
		for(int i =0;i<key.length;i++) {
			if(key[i]<min && !mst[i]) {
				min = key[i];
			}
		}
		
		return min;
	}
}
