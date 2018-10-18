package practice;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'textQueries' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY sentences
     *  2. STRING_ARRAY queries
     */

    public static void textQueries(List<String> sentences, List<String> queries) {
    // Write your code here
        
//        int sizeofSent = sentences.size();
//        int sizeofQuer = queries.size();
        
        List<Map<String, Integer>> list = new ArrayList<Map<String, Integer>>();
        // List<Set<String>> list = new ArrayList<>();
        
        for(String item : sentences){
            String[] parts = item.trim().split(" ");
            Map<String, Integer> map = new HashMap<String, Integer>();
            for(int i =0;i<parts.length;i++) {
            		map.put(parts[i], map.getOrDefault(parts[i], 0)+1);
            }
            list.add(map);
        }
        int k = 0;
        int n=1;
        boolean flag = false, flag1 = false;;
        for(String item: queries) {
        	k = 0;
        		String parts[] = item.trim().split(" ");
        			for(Map m : list) {
                		for(int i=0;i<parts.length;i++) {
                			if(m.containsKey(parts[i]) && (int)m.get(parts[i])>1 ) {
                				n = (int) m.get(parts[i]);
                			}
                			if(!m.containsKey(parts[i])) {
                				flag = true;
                				break;
                			}
                			
                		}
                		if(!flag) {
                			flag1 = true;
                			for(int i =0;i<n;i++)
                				System.out.print(k+" ");
                        	n=1;

                		}
                		
                		flag = false;
                		k++;
        			}
        			
        			if(!flag1) System.out.println("-1");
        			else
            			System.out.println();

        			flag1 = false;
        }
        
        
        

    }

}

public class twitter3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sentencesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> sentences = IntStream.range(0, sentencesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        Result1.textQueries(sentences, queries);

        bufferedReader.close();
    }
}


