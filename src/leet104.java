//Author : Issac Koshy Panicker
//05-01-2018

import java.io.*;
import java.util.*;

class Solution104 {
    public int maxDepth(TreeNode root) {
    
    	 if(root==null){
             return 0;
         }
    	 
    	 	int m = maxDepth(root.left);
    	 	int n = maxDepth(root.right);
    	 	
    	 	return 1+Math.max(m, n);
//         return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
        
    }
}

public class leet104 {
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
            
            int ret = new Solution104().maxDepth(root);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}