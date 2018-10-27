package practice;

import java.util.HashSet;
import java.util.Iterator;

public class CycleDet {

	private HashSet<Integer> white = new HashSet<Integer>();
	private HashSet<Integer> black = new HashSet<Integer>();
	private HashSet<Integer> grey = new HashSet<Integer>();
	
	public static void main(String args[]) {
	
		Graph g = new Graph(7);
		CycleDet c = new CycleDet();
		
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(4, 1);
		g.addEdge(4, 5);
		g.addEdge(5, 6);
		g.addEdge(6, 4);
		
		for(int i =1;i<7;i++) {
			c.white.add(i);
		}
		
		c.detectCycle(g);
		
	}

	private void detectCycle(Graph g) {
		
//		Iterator<Integer> it1 = white.iterator();
		while(!white.isEmpty()) {
			int v = white.iterator().next();
			dfs(v,g);
		}
	}

	
	 // colors: WHITE 0, GRAY 1, BLACK 2;
    public boolean dfsarray(int node, int[] color, int[][] graph) {
        if (color[node] > 0)
            return color[node] == 2;

        color[node] = 1;
        for (int nei: graph[node]) {
            if (color[node] == 2)
                continue;
            if (color[nei] == 1) return false;
            
            if(!dfsarray(nei, color, graph))
                return false;
        }

        color[node] = 2;
        return true;
    }

	private void dfs(int v, Graph g) {
	
		move(v,grey, white);
		
		Iterator<Integer> it = g.getAdj(v).iterator();
		while(it.hasNext()) {
			int v1 = it.next();
			
			if(black.contains(v1)) {
				continue;
			}
			if(grey.contains(v1)) {
				System.out.println("Cycle Found");
			}
			if(white.contains(v1)) {
				dfs(v1,g);
			}
		}
		
		move(v,black,grey);
		
	}

	private void move(int v, HashSet<Integer> dest, HashSet<Integer> source) {
		// TODO Auto-generated method stub
		dest.add(v);
		source.remove(v);
		
	}
	
}
