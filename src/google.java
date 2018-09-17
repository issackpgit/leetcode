  import java.util.*;
import java.io.*;
public class google{
  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int testCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    for (int i = 1; i <= testCases; ++i) {
      int noBus = in.nextInt();
      int arr[] = new int[noBus*2];
      
      for(int j =0;j<noBus*2;j++) {
    	  	arr[j]=in.nextInt();
      }
   
      int noCity = in.nextInt();
      int c[] = new int[noCity];
      
      for(int j=0;j<noCity;j++) {
    	  	c[j] = in.nextInt();
      }
      int count =0;
      System.out.println("\n");
      System.out.print("Case #"+i+": ");
      int temp = noCity;
      for(int l =0;l<noCity;l++) {
    	  	for(int j=0;j<noBus*2;j+=2) {
    	  		if(c[l]<=arr[j+1] && c[l]>=arr[j]) {
    	  			count++;
    	  		}
    	  	}
    	  	System.out.print(count+" ");
    	  	count=0;
      }	
      
    }
  }
}
 