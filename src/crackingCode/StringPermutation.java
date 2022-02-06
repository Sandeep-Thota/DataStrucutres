package crackingCode;

import java.util.Arrays;

public class StringPermutation {
	
	public static void main(String args[]) {
		System.out.println(stringPermut("abcde", "edcab"));
	}
	
	public static boolean stringPermutation(String s1, String s2) {
		char[] first =s1.toCharArray();
		char[] second = s2.toCharArray();
		Arrays.sort(first);
		Arrays.sort(second);
		for(int i=0; i< first.length; i++) {
			if(first[i] != second[i]) {
				return false;
			}
		}
		return true;
	}
	
	
	
	public static boolean stringPermut(String s1, String s2) {
		if(!(s1.length() == s2.length())) {
			return false;
		}
		
		int[] var = new int[128];
		for(int i=0; i< s1.length(); i++) {
			var[s1.charAt(i)]++;
			var[s2.charAt(i)]--;
		}
		for(int i=0; i<var.length; i++) {
			if(var[i] !=0) {
				return false;
			}
		}
		return true;
	}

}
