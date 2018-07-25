//Author : Issac Koshy Panicker
//07-25-2018

import java.io.*;
import java.util.*;

class Solution445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    	     Stack<Integer> s1 = new Stack<Integer>();
         Stack<Integer> s2 = new Stack<Integer>();
         
         while(l1 != null) {
             s1.push(l1.val);
             l1 = l1.next;
         };
         while(l2 != null) {
             s2.push(l2.val);
             l2 = l2.next;
         }
         
         ListNode list = new ListNode(0);
         while(!s1.isEmpty()||!s2.isEmpty()) {
        	 	int sum = list.val;
        	 	if(!s1.isEmpty()) sum+=s1.pop();
        	 	if(!s2.isEmpty()) sum+=s2.pop();
        	 	
        	 	if(sum>9) {
        	 		list.val = sum%10;
        	 	}else {
        	 		list.val=sum;
        	 	}
        	 	ListNode head = new ListNode(sum/10);
        	 	head.next = list;
        	 	list=head;
        	 
         }
         
         if(list.val==0) return list.next;
         else 
        	 	return list;
    }
}

public class leet445 {
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
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode l1 = stringToListNode(line);
            line = in.readLine();
            ListNode l2 = stringToListNode(line);
            
            ListNode ret = new Solution445().addTwoNumbers(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}