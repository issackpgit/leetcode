package practice;
import java.util.*;
import java.io.*;

class Solutioncs {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        
        helper(nums, list, new ArrayList<>(), 0, target);
        return list;
    }
    
    public void helper(int[] nums, List<List<Integer>> list, List<Integer> step, int start, int target){
        if(target<0) return;
        if(target == 0){
            list.add(new ArrayList<>(step));
            return;
        }
        
        for(int i= start;i<nums.length;i++){
            step.add(nums[i]);
            helper(nums, list, step, i+1, target-nums[i]);
            step.remove(step.size()-1);
            
        }   
    }
}

public class CombinationSum {
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
            int[] candidates = stringToIntegerArray(line);
            line = in.readLine();
            int target = Integer.parseInt(line);
            
            List<List<Integer>> ret = new Solutioncs().combinationSum(candidates, target);
            
            String out = int2dListToString(ret);
            
            System.out.print(out);
        }
    }
}