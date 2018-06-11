//Author : Issac Koshy Panicker
//06-11-2018

import java.io.*;
import java.util.*;

class Solution31 {
    public void nextPermutation(int[] nums) {
        
        int i =nums.length-2;
        while(i>=0 && nums[i+1] <= nums[i]){
//            if(nums[i]<=nums[i+1]){
//                break;
//            }
            i--;
        }
        System.out.println(i);
        if(i>=0){
        int j = nums.length -1;
            System.out.println(j);
        while(j>=0 && nums[j] <= nums[i]){   
//            if(nums[j]>nums[i])
//                break;
//            
            j--;
           
        }
        System.out.println(j);
        swap(nums,i,j);
       
         }
         reverse(nums,i+1);
    }
        
    private void swap(int[] nums, int i , int j){

        System.out.println("here");
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
                System.out.println("hree1");

    }
    
    private void reverse(int[] nums, int start)
    {
        int i = start, j = nums.length -1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    } 
    
}

public class leet31 {
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
            int[] nums = stringToIntegerArray(line);
            
            new Solution31().nextPermutation(nums);
            String out = integerArrayToString(nums);
            
            System.out.print(out);
        }
    }
}