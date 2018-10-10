package practice;

import java.util.*;

public class Dijikstras {
	public static void main(String args[]) {
		GraphNew g = new GraphNew(6, false);
		
		Dijikstras d = new Dijikstras();
		
		g.addEdge(0, 1, 5);
		g.addEdge(1, 2, 2);
		g.addEdge(2, 3, 3);
		g.addEdge(0, 3, 9);
		g.addEdge(0, 4, 2);
		g.addEdge(4, 5, 3);
		g.addEdge(3, 5, 2);
		
		d.findShortest(g);	
	}

	private void findShortest(GraphNew g) {
		int key[] = new int[g.V];
		int dist[] = new int[g.V];
		int parent[] = new int[g.V];
		boolean sp[] = new boolean[g.V];
		
		for(int i =0;i<g.V;i++) {
			key[i] = Integer.MAX_VALUE;
		}
		
		key[0]=0;
		parent[0] =-1;
		
		for(int i =0;i<g.V;i++) {
			int cur = findMin(key, sp);
			sp[cur] = true;
			dist[cur] = key[cur];
			
			Iterator<GraphNew.Edge> it = g.getAdj(cur).iterator();
			
			while(it.hasNext()) {
				GraphNew.Edge ed = it.next();
				if((ed.weight+dist[cur])<key[ed.dest]) {
					key[ed.dest] = ed.weight+dist[cur];
					parent[ed.dest] = cur;
				}
			}
			
		}
		System.out.println("parent");
	
	}

	private int findMin(int[] key, boolean[] sp) {
		int min =Integer.MAX_VALUE;
		int d = 0;
		
		for(int i =0;i<key.length;i++) {
			if(key[i]<min && !sp[i]) {
				min = key[i];
				d=i;
			}
		}
		
		return d;
	}
	
}
