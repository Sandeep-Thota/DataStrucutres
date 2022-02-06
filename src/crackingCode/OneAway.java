package crackingCode;

public class OneAway {

	public static void main(String[] args) {
		System.out.println(oneAway("paptt", "part"));

	}
	
	public static boolean oneAway(String s1, String s2) {
		if(Math.abs(s1.length() - s2.length())>1) {
		  return false;
		}
		
		if(s1.length() == s2.length()) {
			return oneReplacement(s1, s2);
		}else if(s1.length()+1 == s2.length()) {
			return oneRemoval(s1, s2);
		}else {
			return oneRemoval(s2,s1);
		}
	}
	
	
	public static boolean oneReplacement(String s1,String s2) {
		boolean oneReplace = false;
		for(int i=0; i< s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(oneReplace) {
					return false;
				}
				oneReplace=true;
			}
		}
		return true;
	}
	
	public static boolean oneRemoval(String s1, String s2) {
		int index1 =0;
		int index2 = 0;
	while(index1 < s1.length() && index2 < s2.length()) {
		if(s1.charAt(index1) != s2.charAt(index2)) {
			if(index1 != index2) {
				return false;
			}
			index2++;
		}else {
		index1++;
		index2++;
		}
	}
	return true;
	}

}
