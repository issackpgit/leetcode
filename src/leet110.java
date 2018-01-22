//Author : Issac Koshy Panicker
//21-01-2018

import java.io.*;
import java.util.*;

class Solution110{
    public boolean isBalanced(TreeNode root) {

    	if(root==null ) return true;  	
    	return maxDepth(root)!=-1;

//  Another method with O(n) DFS used
    	
//    		int m = maxDepth(root.left);
//    		int n = maxDepth(root.right);
//    		
//    	if(Math.abs(m-n)<=1 && isBalanced(root.left) && isBalanced(root.right) )
//    		return true;
//    	
//	 	return false;
//    }
//
//	private int maxDepth(TreeNode root) {
//		// TODO Auto-generated method stub
//		if(root == null)
//			return 0;
//		
//		int m = maxDepth(root.left);
//		int n = maxDepth(root.right);
//		
//		return 1+Math.max(m, n);
	}

	private int maxDepth(TreeNode root) {
		
		if(root == null)
			return 0;
		
		int left = maxDepth(root.left);
		if(left == -1) return -1;
		
		int right = maxDepth(root.right);
		if(right == -1) return -1;
		
		if(Math.abs(left-right)>1) return -1;
		
		return 1+Math.max(left, right);
	}
    
    
}

public class leet110 {
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
    
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            boolean ret = new Solution110().isBalanced(root);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}