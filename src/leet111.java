import java.io.*;
import java.util.*;

class Solution111 {
   public int minDepth(TreeNode root) {
        
   return fun(root); 	
   }

	private int fun(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root == null)
			return 0;
		
		if(root.left == null && root.right == null) return 1;
		int right=0, left = 0;
		
		if(root.left==null) {
			right = fun(root.right)+1;
			return right;
			}
		
		if(root.right==null) {
			left = fun(root.left)+1;
			return left;
		}
		return Math.min(fun(root.left),fun(root.right))+1;
	}
}

public class leet111 {
    public static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
    
        int index = 1;
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }
    
            if (index == parts.length) {
                break;
            }
    
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            int ret = new Solution111().minDepth(root);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}