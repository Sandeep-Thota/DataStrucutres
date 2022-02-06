package crackingCode;

public class PalindromePermutation {
	
	public static void main(String args[]) {
		System.out.println(isPalindrome("taco mamotca"));	
	}
	
	
	public static boolean palindromePermutation(String s) {
		int[] alphaCount = charCount(s);
		return checkMaxOneOdd(alphaCount);
		
		
	}
	public static int getChar(Character c) {
		int x = Character.getNumericValue('a');
		int y = Character.getNumericValue('z');
		int var = Character.getNumericValue(c);
		if(var >= x && var <= y) {
			return var-x;
		}
		return -1;
	}

	public static int[] charCount(String s) {
		int[] count = new int[Character.getNumericValue('z') - Character.getNumericValue('a')+1];
		
		
		for(int i = 0; i< s.length(); i++) {
			int x = getChar(s.charAt(i));
			if(x != -1)count[x]++;	
		}
		return  count;
	}
	
	public static boolean checkMaxOneOdd(int[] count) {
		boolean isOdd = false;
		for(int i= 0; i< count.length; i++) {
			if(count[i] %2 == 1) {
				if(isOdd) {
					return false;
				}
				isOdd = true;
			}
		}
		return true;
	}
	
	/*
	 * *************************************************************************************************
	 */
	
	public static boolean isPalindrome(String s) {
		int[] counts = new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
	    int countOdd =0;
	    
	    for(int i = 0; i< s.length(); i++) {
	    	int x = getChar(s.charAt(i));
	    	if(x != -1) {
	    		counts[x]++;
	    		if(counts[x]%2 ==1) {
	    			countOdd++;
	    		}else {
	    			countOdd--;
	    		}
	    	}
	    	
	    }
	    return countOdd <=1;
		
	}
	
	
	
	
}
