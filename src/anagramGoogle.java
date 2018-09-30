import java.util.*;
import java.io.*;
public class anagramGoogle {
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int noOfCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <=noOfCases ; ++i) {
   
    	int length = in.nextInt();
    	in.nextLine();
    	String s1 = in.nextLine();
    	String s2 = in.nextLine();
    	
    	ArrayList array1 = SubString(s1,s1.length());
    	ArrayList array2 = SubString(s2,s2.length());
    	ArrayList temp = array1;
    	
    	array1.removeAll(array2);
    	array2.removeAll(temp);

    	int s = array2.size()-array1.size();
    	System.out.println("Case #"+i+": "+s);
    }
  }
  
  public static ArrayList<String> SubString(String str, int n) 
  { 
	  ArrayList<String> a = new ArrayList<String>();
     for (int i = 0; i < n; i++)  
         for (int j = i+1; j <= n; j++) {
        	 char[] temp = str.substring(i,j).toCharArray();
        	 Arrays.sort(temp);
         a.add(new String(temp));     
         }
	return a; 
  } 
  
}
