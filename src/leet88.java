//Author : Issac Koshy Panicker
//02-01-2018

import java.io.*;

class Solution88 {
    public void merge(int[] A, int m, int[] B, int n) {

//    	while(m > 0 && n > 0){
//            if(A[m-1] > B[n-1]){
//                A[m+n-1] = A[m-1];
//                m--;
//            }else{
//                A[m+n-1] = B[n-1];
//                n--;
//            }
//        }
 
//        while(n > 0){
//            A[m+n-1] = B[n-1];
//            n--;
//        }
   //--------- 	
    	int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(A[i] > B[j])
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		while(j>=0)
			A[k--] = B[j--];
   
//------------    	
//    	int j = 0,k=0;
//    	for(int i =0;i<m;) {
//    		if(nums1[i]<nums2[j]) {
//    			i++;
//    		}
//    		else {
//    			for(k = m-1;k>=i;k--) {
//    				nums1[k+1]=nums1[k];
//    			}
//    			j++;
//    			nums1[k]=nums2[j];
//    		}
//    		
//    	}
        
    }
}

public class leet88 {
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
    
    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums1 = stringToIntegerArray(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int[] nums2 = stringToIntegerArray(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            new Solution88().merge(nums1, m, nums2, n);
            String out = integerArrayToString(nums1);
            
            System.out.print(out);
        }
    }
}