package practice;

public class InsertNodeBST {
	
	Node root = new Node(10);

	public static void main(String args[]) {
		InsertNodeBST i = new InsertNodeBST();
		
		
		i.insert(i.root,1);
		i.insert(i.root,20);
		i.insert(i.root,30);
		
		TreeTraversals t = new TreeTraversals();
		
		t.inorder(i.root);
	}

	private Node insert(Node root, int i) {
		if(root == null) {
			root = new Node(i);
			return root;
		}
		if(i< root.data) {
			root.left = insert(root.left,i);
		}
		else {
			root.right = insert(root.right, i);
		}
		return root;
	}
}
