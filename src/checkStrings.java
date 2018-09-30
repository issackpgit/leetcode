import java.util.*;

public class checkStrings {

	public static void main(String args[]) {
		String s1= "hello  123 ";
		String s2= "hello  123 ";
		
		char a[] = s1.toCharArray();
		
		System.out.println(checkString(s1,s2));
	}
	
	static boolean checkString(String s1, String s2) {
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		
		if(s1.length()!=s2.length()) return false;
		
		for(int i =0;i<s1.length();i++) {
			hm1.put(s1.charAt(i), hm1.getOrDefault(s1.charAt(i), 0)+1);
			hm2.put(s2.charAt(i), hm2.getOrDefault(s2.charAt(i), 0)+1);
		}
		if(hm1.equals(hm2)) return true;
		else return false;
		
	}
	
}
