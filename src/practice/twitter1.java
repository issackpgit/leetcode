package practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

public class twitter1 {

    // Complete the electionWinner function below.
    static String electionWinner(String[] votes) {
    
    	Map<String, Integer> map= new HashMap<String, Integer>();
    	
    	for(String item : votes) {
    		map.put(item, map.getOrDefault(item, 0)+1);
    	}
    	
    	int maxVal = 0;
    	String maxName = "";
    	
    	for (Entry<String, Integer> entry : map.entrySet()) {
    		if(entry.getValue()>maxVal) {
    			maxVal = entry.getValue();
    			maxName = entry.getKey();
    			continue;
    		}
    		if(entry.getValue() == maxVal) {
    			if(entry.getKey().compareTo(maxName)>0)
    				maxName = entry.getKey();
    		}
    		
    		
    	}
    	
    	
    	return maxName;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int votesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] votes = new String[votesCount];

        for (int i = 0; i < votesCount; i++) {
            String votesItem = scanner.nextLine();
            votes[i] = votesItem;
        }

        String res = electionWinner(votes);
        System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

