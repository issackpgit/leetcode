package practice;
import java.io.*;

class SolutionCoin {
    public int coinChange(int[] coins, int amount) {
        int[] T = new int[amount+1];
        int[] R = new int[amount+1];
        
        for(int i = 0;i<amount+1;i++){
            T[i] = Integer.MAX_VALUE-1;
            R[i] = -1;
        }
        T[0] = 0;
        for(int j = 0;j<coins.length;j++){
            for(int i =1;i<T.length;i++){
                if(i>=coins[j]){
                    T[i] = Math.min(T[i],T[i-coins[j]]+1);
                    R[i] = j;
                }
            }
        }
        
        if(T[amount]==Integer.MAX_VALUE-1) return -1;
        else return T[amount];
    }
}

public class CoinChange {
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
            int[] coins = stringToIntegerArray(line);
            line = in.readLine();
            int amount = Integer.parseInt(line);
            
            int ret = new SolutionCoin().coinChange(coins, amount);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}