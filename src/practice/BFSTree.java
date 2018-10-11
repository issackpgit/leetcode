package practice;

import java.util.*;
import java.util.Queue;

public class BFSTree {
	public static void main(String args[]) {
		
		BFSTree b = new BFSTree();

		Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		
		b.bfs(root);
	}

	private void bfs(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			Node a = q.poll();
			System.out.println(a.data);
			if(a.left!=null)
				q.add(a.left);
			if(a.right!=null)
				q.add(a.right);
		}
	}
}
