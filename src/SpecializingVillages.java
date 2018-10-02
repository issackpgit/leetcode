import java.util.*;
import java.io.*;
public class SpecializingVillages {

	public static int noOfVillages,noOfRoads;
	public static boolean graph[][];
	public static int g[][] ;
	public static int marked[];
	public static int cc[] ;
public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int noOfCases = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
  	/*
	 *  2 
	3 3
	1 2 1
	1 3 6
	2 3 4
	6 5
	1 2 6
	3 4 0
	5 6 7
	3 5 1
	4 6 2
	 */
    
    for (int i = 1; i <=noOfCases ; ++i) {
    		 noOfVillages = in.nextInt();
    		 noOfRoads = in.nextInt();
    		 marked = new int[noOfVillages];
    		 cc = new int[noOfVillages];
    		 graph = new boolean[noOfVillages][noOfVillages];
    		 g = new int[noOfVillages][noOfVillages];
    		int a,b,c;
    		for(int j=0;j<noOfRoads;j++) {
    			a = in.nextInt();
    			b = in.nextInt();
    			c = in.nextInt();
    			graph[a-1][b-1] = true;
    			graph[b-1][a-1] = true;
      		g[a-1][b-1] = c;
    			g[b-1][a-1] = c;
    		}
    		
    		findCC();
    		
//    		int noOfCC = 
    		
    } 
   }

private static void findCC() {
	// TODO Auto-generated method stud
	
	for(int v = 0;v <noOfVillages;v++) {
		if(marked[v]!=1) {
			dfs(v,v);
			System.out.println("new");
		}
	}
	
}

private static void dfs(int v,int root) {
	// TODO Auto-generated method stub
	marked[v] = 1;
	System.out.println(v);
	cc[v] = root;
	for(int p=0;p<g.length;p++) {
		if(graph[v][p] && marked[p]!=1)
		{
			dfs(p,root);
//			cc[p]=c;
		}
	}
}
}