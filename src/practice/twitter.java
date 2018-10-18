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


class Result {

    /*
     * Complete the 'minimalOperations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static List<Integer> minimalOperations(List<String> words) {
    	
    		Iterator<String> it = words.iterator();
    		List<Integer> result = new ArrayList<Integer>();
    		
    		while(it.hasNext()) {
    			String a = it.next();
    			int count =0;
    			boolean flag = false;
    			char[] c = a.toCharArray();
    			char prev = c[0];
    			for(int i=1;i<c.length;i++) {
    				if(c[i]==prev && !flag) {
    					count++;
    					flag = true;
    					prev = c[i];
    					continue;
    				}
    				prev = c[i];
    				flag= false;
    			}
    			result.add(count);
    		}
		return result;

    }

}


public class twitter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int wordsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, wordsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.minimalOperations(words);
        for(Integer item : result)
        		System.out.println(item);

//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining("\n"))
//            + "\n"
//        );

        bufferedReader.close();
//        bufferedWriter.close();
    }
}