package crackingCode;

public class URLify {

	public static void main(String[] args) {
		String c = "Mr John Smilth       ";
	System.out.println(urlify(c.toCharArray(), c.trim().length()));

	}

	public static char[] urlify(char[] str, int trueLength) {
		int numberOfSpaces = countSpaces(str, 0,trueLength, ' ');
		int newIndex = trueLength-1 + 2*numberOfSpaces;
		
		
		if(newIndex+1 < str.length) str[newIndex+1] = '\0';
		for(int i=trueLength-1; i>= 0; i -=1) {
			if(str[i] == ' ') {
				str[newIndex] = '0';
				str[newIndex-1]= '2';
				str[newIndex-2] = '%';
				
				newIndex -=3;
			}
			else {
				str[newIndex] = str[i];
				newIndex -=1;
			}
		}
		
		return str;
	}
	
	public static int countSpaces(char[] str, int start, int end, char target) {
		int count =0;
		for(int i= start; i<end; i++) {
			if(str[i] == target) {
				count++;
			}
		}
		return count;
	}
}
