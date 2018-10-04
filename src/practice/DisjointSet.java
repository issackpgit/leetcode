package practice;

import java.util.*;

public class DisjointSet {

	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	
	public class Node{
		int data;
		int rank;
		Node parent;
	}
	
	public void makeSet(int data) {
		Node node = new Node();
		node.data = data;
		node.parent = node;
		node.rank = 0;
		map.put(data, node);
	}
	
	public int findSet(int data) {
		return findSet(map.get(data)).data;
	}
	
	public Node findSet(Node node) {
		
		if(node.parent == node){
			return node.parent;
		}
		node.parent = findSet(node.parent);
		return node.parent;
	}
	
	public void union(int p, int q) {
		Node node1 = map.get(p);
		Node node2 = map.get(q);
		
		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);
		
		if(parent1.data == parent2.data) {
			return;
		}
		
		if(parent1.rank>=parent2.rank) {
			parent2.parent = parent1;
			if(parent1.rank == parent2.rank)
				parent1.rank+=1;
		}
		else {
			parent1.parent = parent2;
		}
		
	}
	
	public static void main(String args[]) {
		DisjointSet d = new DisjointSet();
		
		d.makeSet(1);
		d.makeSet(2);
		d.makeSet(3);
		d.makeSet(4);
		d.makeSet(5);
		d.makeSet(6);
		d.makeSet(7);
		
		d.union(1, 2);
		d.union(2, 3);
		d.union(4, 5);
		d.union(6, 7);
		d.union(5, 6);
		d.union(3, 7);
		
		System.out.println(d.findSet(1));
		System.out.println(d.findSet(2));
		System.out.println(d.findSet(3));
		System.out.println(d.findSet(4));
		System.out.println(d.findSet(5));
		System.out.println(d.findSet(6));
		System.out.println(d.findSet(7));
	}
	
}
