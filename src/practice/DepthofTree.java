package practice;

public class DepthofTree {

	public static void main(String args[]) {
		DepthofTree d = new DepthofTree();
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(6);
		root.left.right.left = new Node(7);
		
		int n = d.maxDepth(root);
		System.out.println(n);
	}

	private int maxDepth(Node root) {
		if(root==null)
			return 0;
		else {
			int n = Math.max(maxDepth(root.left), maxDepth(root.right)) +1;
			return n;
		}
	}
}
