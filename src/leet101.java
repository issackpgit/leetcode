//Author : Issac Koshy Panicker
//05-01-2018

import java.io.*;
import java.util.*;

class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        
    	TreeNode b= root;
    	 Stack<TreeNode> stack = new Stack<>();
         stack.push(root);
         stack.push(b);
         
         while(!stack.isEmpty()) {
             TreeNode nodep = stack.pop();
             TreeNode nodeq = stack.pop();
             if(nodeq == null && nodep == null) {
                 continue;
             } else if (nodeq == null || nodep == null || nodeq.val != nodep.val) {
                 return false;
             } else {
             stack.push(nodep.left);
             stack.push(nodeq.right);
             stack.push(nodep.right);
             stack.push(nodeq.left);
             
             }
         }

    	return true;
    	
    }
}

public class leet101 {
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
            
            boolean ret = new Solution101().isSymmetric(root);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}