package practice;
import practice.Graph.Edge;

public class CycleDet2 {

	private DisjointSet d = new DisjointSet();
	
	public static void main(String args[]) {
		 
		Graph g = new Graph(5);
		CycleDet2 c = new CycleDet2();
		
		g.addEdge(0,1);
		g.addEdge(1,2);
		g.addEdge(2,3);
		g.addEdge(3,0);
//		g.addEdge(3,4);
		
		c.findCycle(g);
		
	}

	private void findCycle(Graph g) {
		
		for(int i =0;i<g.V;i++) {
			d.makeSet(i);
		}
		
		for(Edge e : g.edges.keySet()) {
			
			if(d.findSet(e.v)==d.findSet(e.e)) {
				System.out.println("Cycle found");
				return;
			}
			else {
				d.union(e.v, e.e);
			}
		}
		System.out.println("No cycle found");
		
	}
	
}
