//Author : Issac Koshy Panicker
//23-01-2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    	
    	 int lenA = length(headA), lenB = length(headB);
     int diff = Math.abs(lenA-lenB);
     int temp =diff;
     if(lenA>lenB){
          while(diff!=0){
        	  	headA=headA.next;
        	  	diff--;
          }
     }
     else while(temp!=0){
    	 	headB=headB.next;
    	 	temp--;
     }
               
       while (headA != headB) {
           headA = headA.next;
           headB = headB.next;
       }
      
       return headA;

       
//        ListNode a = headA;
//        ListNode b = headB;
//        
//        //if a & b have different len, then we will stop the loop after second iteration
//        while( a != b){
//        	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
//            a = a == null? headB : a.next;
//            b = b == null? headA : b.next;    
//        }
//        
//        return a;
       
//Using HashSet Space Complexity O(n)
       
//    	Set<ListNode> set = new HashSet<ListNode>();
//    	
//    	while(headA!=null) {
//    		set.add(headA);
//    		headA=headA.next;
//    	}
//     	while(headB!=null) {
//    		
//     		if(set.contains(headB)) {
//     			return headB;
//     		}
//     		
//    		headB=headB.next;
//    	}
//    	
//    	return null;
//        
    }

private int length(ListNode node) {
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
}

public class leet160 {
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
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line1,line2;
        
        	
        	line1 = in.readLine();
        	line2 = in.readLine();
            ListNode head1 = stringToListNode(line1);
            ListNode head2 = stringToListNode(line2);
            
            ListNode ret = new Solution160().getIntersectionNode(head1,head2);
            
//            String out = booleanToString(ret);
            
//            System.out.print(out);
        
    }
}