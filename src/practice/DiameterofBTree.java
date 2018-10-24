package practice;

public class DiameterofBTree {
	
	public static void main(String args[]) {
		DiameterofBTree d = new DiameterofBTree();
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.right = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.left.left = new Node(6);
		root.left.right.left = new Node(7);
		
		int ans = d.findDiameter(root);
		
		System.out.println(ans);
	}

	private int findDiameter(Node root) {
		if(root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			int d = lheight + rheight + 1;
			
			int ldiameter = findDiameter(root.left);
			int rdiameter = findDiameter(root.right);
			
			int ans = Math.max(d, Math.max(ldiameter, rdiameter));
			return ans;
		}
	}

	private int height(Node root) {
		if(root == null)
			return 0;
		else {
			int n = Math.max(height(root.left), height(root.right))+1;
			return n;
		}
	}
}
