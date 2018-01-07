import java.io.*;

class Solution121 {
    public int maxProfit(int[] prices) {
    	
	if(prices.length==0) return 0;
    	
    	int buy = prices[0];
    	int sell = 0,p=0, temp =0;
    	int max =Integer.MIN_VALUE;
        
     	for(int i = 0 ;i<prices.length-1;i++) {
     		if(prices[i]>prices[i+1]) {
     			sell = prices[i];
     			p=sell-buy;
     			buy = prices[i+1];
//     			temp=p;
     			
     			for(int j = i+1;j< prices.length;j++) {
     				if(prices[j]>max) {
     					max = prices[j];
     				}
     			}
     			
     			temp = Math.max(temp, max-buy);
     			max =Integer.MIN_VALUE;
     		}
    		
    		}
  
    	return p;
    	
    }
}

public class leet121 {
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
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] prices = stringToIntegerArray(line);
            
            int ret = new Solution121().maxProfit(prices);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}