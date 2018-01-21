//Author : Issac Koshy Panicker
//21-01-2018

import java.io.*;
import java.util.*;

class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
    	
    	if (nums.length == 0) {
            return null;
        }
   
    	TreeNode node = findRecursive(nums,0, nums.length-1);
    	
	return node;
        
    }

	private TreeNode findRecursive(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		
		if(start>end)
			return null;
		
		int mid = (start+end)/2;
		
		TreeNode node = new TreeNode(nums[mid]);
		
		node.left = findRecursive(nums, start, mid-1);
		
		node.right = findRecursive(nums, mid+1, end);
		
		return node;
	}
}

public class leet108 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }
    
        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while(!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
    
            if (node == null) {
              output += "null, ";
              continue;
            }
    
            output += String.valueOf(node.val) + ", ";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            TreeNode ret = new Solution108().sortedArrayToBST(nums);
            
            String out = treeNodeToString(ret);
            
            System.out.print(out);
        }
    }
}