//Author : Issac Koshy Panicker
//06-01-2018

import java.io.*;
import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
    	  
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<Integer>();
        
        while(root!=null){
            list.add(root.val);
            if(root.right!=null){
                stack.push(root.right);
            }
            root = root.left;
            if(root==null && !stack.isEmpty()){
                root = stack.pop();
            }
        }
        
        return list;
    } 
        
        
    //     List<Integer> list = new ArrayList<Integer>();
    //     helper(root,list);
    //     return list;
    // }
    // public void helper(TreeNode root, List list){
    //     if(root!=null){
    //         list.add(root.val);
    //         if(root.left!=null)
    //             helper(root.left,list);
    //         if(root.right!=null)
    //             helper(root.right,list);
    //     }
    // } 

}

public class leet144 {
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
    
    public static String integerArrayListToString(List<Integer> nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            Integer number = nums.get(index);
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            
            List<Integer> ret = new Solution144().preorderTraversal(root);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}