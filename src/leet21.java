import java.io.IOException;
import java.io.*;

class Solution21 {
	
	ListNode head;
	
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode A = new ListNode(0);
    ListNode ptr = A;

    while(l1!=null && l2!= null) {
    	
    	if(l1.val<l2.val) {
    		ptr.next = new ListNode(l1.val);
    		l1=l1.next;
    	}
    	else
    	{
    		ptr.next = new ListNode(l2.val);
    		l2=l2.next;
    	}
    	    	ptr=ptr.next;
    }
    
    while(l1!=null) {
	    	ptr.next = new ListNode(l1.val);
	    	l1 = l1.next;
	    	ptr = ptr.next;
    }
    
    while(l2!=null) {
	    	ptr.next = new ListNode(l2.val);
	    	l2= l2.next;
	    	ptr = ptr.next;
    }
    
    	return A.next;
    }
}

public class leet21 {
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
            
            ListNode ret = new Solution21().mergeTwoLists(l1, l2);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}