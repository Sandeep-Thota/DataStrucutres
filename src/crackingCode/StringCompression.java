package crackingCode;

public class StringCompression {

	public static void main(String[] args) {
		System.out.println(stringCompression("aaaabcbbbaa"));

	}
	
	public static String stringCompression(String str) {
		StringBuffer buffer = new StringBuffer();
		int count =0;
		for(int i=0 ; i< str.length(); i++) {
			count++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				buffer.append(str.charAt(i)).append(count);
				count =0;
			}
		}
		return buffer.toString().length() < str.length() ? buffer.toString():str;
	}

}
