//Author : Issac Koshy Panicker
//06-25-2018

import java.io.*;
import java.util.*;

class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<10;++i){
          dfs(i, n, res); 
        }
        return res;

    }
    
    public void dfs(int cur, int n, List<Integer> res){
    	if(cur>n)
            return;
        else{
            res.add(cur);
            for(int i=0;i<10;++i){
                if(10*cur+i>n)
                    return;
                dfs(10*cur+i, n, res);
            }

        }
    }
}

public class leet386 {
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
            int n = Integer.parseInt(line);
            
            List<Integer> ret = new Solution386().lexicalOrder(n);
            
            String out = integerArrayListToString(ret);
            
            System.out.print(out);
        }
    }
}