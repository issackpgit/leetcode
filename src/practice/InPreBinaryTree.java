package practice;
/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class SolutionipT {
    public TreeNode buildTree(int[] p, int[] in) {
    
        int start =0, end = p.length, index= 0;
        
        return helper(p, in, start, end-1, start, end-1);
    }
    
    public TreeNode helper(int [] pre, int [] in, int instart, int inend, int prestart, int preend){
        
        if(pre.length == 0 || in.length ==0) return null;
        if(inend>pre.length || preend>pre.length) return null;
        if(instart>inend || prestart>preend) return null;
        
        
        int rootVal = pre[prestart], index =0;
        
        TreeNode root = new TreeNode(rootVal);
        root.left = null;
        root.right = null;
        
        for(int i =instart;i<=inend;i++){
            if(in[i]== rootVal){
                index = i;
                break;
            }
        }
        
        int linstart_ = instart;
        int linend_ = index-1;
        int linlength = linend_-linstart_+1;
        
        int lprestart_ = prestart+ 1;
        int lpreend_ = prestart+linlength;
        
        int rinstart_ = index+1;
        int rinend_ = inend;
        int rinlength_ = rinend_-rinstart_+1;
        
        int rprestart_ = prestart+linlength+1;
        int rpreend_ = preend;
        
        root.left = helper(pre, in, linstart_, linend_, lprestart_, lpreend_);
        root.right = helper(pre, in, rinstart_, rinend_, rprestart_, rpreend_);
        
        return root;
    }
}

public class InPreBinaryTree {
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
        LinkedList<TreeNode> nodeQueue = new LinkedList<>();
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
            int[] preorder = stringToIntegerArray(line);
            line = in.readLine();
            int[] inorder = stringToIntegerArray(line);
            
            TreeNode ret = new SolutionipT().buildTree(preorder, inorder);
            
            String out = treeNodeToString(ret);
            
            System.out.print(out);
        }
    }
}