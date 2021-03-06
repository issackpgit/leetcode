//Author : Issac Koshy Panicker
//09-01-2018

import java.io.*;
import java.util.*;

class Solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
		
    	 List<List<Integer>> list = new ArrayList<List<Integer>>();
     
    	 if(root==null) return list;
         
    	 Queue<TreeNode> q = new LinkedList<TreeNode>();
    	 q.add(root);
    	 
    	 while(!q.isEmpty()) {
    		 int h = q.size();
    		 List<Integer> list1 = new ArrayList<Integer>();
    		 while(h>0) {
    			 TreeNode node = q.peek();
    			 list1.add(node.val);
    			 q.remove();
    			 if(node.left != null)
                q.add(node.left);
             if(node.right != null)
                q.add(node.right);
             h--;
    		 }
    		 list.add(list1);
    	 }    	
    	return list;  
    }  
}

public class leet102 {
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
            
            List<List<Integer>> ret = new Solution102().levelOrder(root);
            
//            String out = String.valueOf(ret);
            
//            System.out.print(out);
        }
    }
}