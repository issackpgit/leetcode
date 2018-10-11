package practice;

public class TreeTraversals {
	public static void main(String args[]) {
		TreeTraversals i = new TreeTraversals();
		
		Node root = new Node(1);
		
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		
		System.out.println("Inorder");
		i.inorder(root);
		System.out.println("Preorder");
		i.preorder(root);
		System.out.println("Postorder");
		i.postorder(root);

	}

	private void postorder(Node root) {
		if(root == null)
			return ;
		else {
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.data);
		}
	}

	private void preorder(Node root) {
		if(root== null) {
			return;
		}
		else {
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}

	public void inorder(Node root) {
		if(root == null)
			return;
		else {
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
}
