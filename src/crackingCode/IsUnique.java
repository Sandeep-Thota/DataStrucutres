package crackingCode;

public class IsUnique {
	public static void main(String args[]) {
		System.out.println("is unique "+isUnique("daarf"));
	}
	
	public static boolean isUnique(String s) {
//		boolean[] words = new boolean[128];
//		for(int i=0; i< s.length(); i++) {
//			char char1 = s.charAt(i);
//			if(words[char1] == true) {
//				return false;
//			}
//			words[char1]= true;
//			
//		}
//		return true;
		int checker =0;
		for(int i=0; i<s.length();i++) {
			int val = s.charAt(i)-'a';
			System.out.println(1 << val);
			if((checker & (1 << val)) >0) {
				return false;
			}
			checker |=(1 << val);
		}
		return true;
	}

}
