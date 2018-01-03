//Author : Issac Koshy Panicker
//02-01-2018

import java.io.*;
import java.util.*;


class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	  	
    	 Queue<TreeNode> nodeQ = new LinkedList<>();
         nodeQ.add(p);
         nodeQ.add(q);
         
         while(!nodeQ.isEmpty()) {
             TreeNode nodeq = nodeQ.remove();
             TreeNode nodep = nodeQ.remove();
             if(nodeq == null && nodep == null) {
                 continue;
             } else if (nodeq == null || nodep == null || nodeq.val != nodep.val) {
                 return false;
             } else {
             nodeQ.add(nodep.left);
             nodeQ.add(nodeq.left);
             nodeQ.add(nodep.right);
             nodeQ.add(nodeq.right);
             }
         }
         return true;
    	
//    	Stack<TreeNode> stack = new Stack<>();
//        stack.push(p);
//        stack.push(q);
//            
//             while(!stack.isEmpty()) {
//                 TreeNode qn = stack.pop();
//                 TreeNode pn = stack.pop();
//                 if(qn == null && pn == null) {
//                     continue;
//                 } else if (qn == null || pn == null || qn.val != pn.val) {
//                     return false;
//                 } else {
//                 stack.push(pn.left);
//                 stack.push(qn.left);
//                 stack.push(pn.right);
//                 stack.push(qn.right);
//                 }
//             }
//             return true;
    }
}

public class leet100 {
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
            TreeNode p = stringToTreeNode(line);
            line = in.readLine();
            TreeNode q = stringToTreeNode(line);
            
            boolean ret = new Solution100().isSameTree(p, q);
            
            String out = booleanToString(ret);
            
            System.out.print(out);
        }
    }
}