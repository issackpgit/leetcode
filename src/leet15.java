//Author : Issac Koshy Panicker
//05-30-2018

import java.io.*;
import java.util.*;

class Solution15 {
    public List<List<Integer>> threeSum(int[] a) {
    		boolean flag = false;
    		int n =a.length;
    		List<List<Integer>> list = new ArrayList<List<Integer>>();
    		HashSet tab = new HashSet();
    		for(int i =0;i<n-2;i++) {
    			for(int j = i+1;j<n-1;j++) {
    				int x =(a[i]+a[j])*-1;
    				if(tab.contains(x)){
    					List<Integer> newList = new ArrayList<Integer>();
    					newList.add(a[i]);
    					newList.add(a[j]);
    					newList.add((a[i]+a[j])*-1);
    					Collections.sort(newList);
    					for(List item : list) {
    						if(newList.equals(item)) {
    							flag =true;
    						}
    					}
    					if(!flag)
    						list.add(newList);
    					flag = false;
    				}
    				else {
						tab.add(a[j]);
					}
    			}
    		}
    	
    	
    	return list;
    	//Bruteforce
    	/*List<List<Integer>> list = new ArrayList<List<Integer>>();	
    	boolean flag = false;
    	int n = nums.length;
    	for(int i =0;i<n-2;i++)
    	{
    		for(int j = i+1;j<n-1;j++) {
    			for(int k =j+1;k<n;k++) {
    				if(nums[i]+nums[j]+nums[k]==0) {
    					List<Integer> newList = new ArrayList<Integer>();
    					newList.add(nums[i]);
    					newList.add(nums[j]);
    					newList.add(nums[k]);
    					Collections.sort(newList);
    					
    					for(List item : list) {
    						if(newList.equals(item)) {
    							flag =true;
    						}
    					}
    					if(!flag)
    						list.add(newList);
    					flag = false;
    				}
    			}
    		}
    	}
    	return list; */
    }
}

public class leet15 {
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
    
    public static String int2dListToString(List<List<Integer>> nums) {
        StringBuilder sb = new StringBuilder("[");
        for (List<Integer> list: nums) {
            sb.append(integerArrayListToString(list));
            sb.append(",");
        }
    
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            List<List<Integer>> ret = new Solution15().threeSum(nums);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
        }
    }
}