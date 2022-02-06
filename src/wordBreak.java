import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wordBreak {

	public static void main(String[] args) {
		List<String> wordDict = new ArrayList<>();
		wordDict.add("apple");
		wordDict.add("pen");
		Boolean result= wordBreak("applepenapple",wordDict );
		System.out.println("Output is "+result);
	}
	
    
    public static  boolean wordBreak(String s, List<String> wordDict) {
    	Map<String, Boolean> map = new HashMap<>();
        if(wordDict.contains(s)){
            return true;
        }
        if(map.containsKey(s)){
            return map.get(s);
        }
        
        for(int i=1 ; i<= s.length(); i++){
            String left = s.substring(0,i);
            if(wordDict.contains(left) && wordBreak(s.substring(i,s.length()),wordDict)){
                map.put(s,true);
                return true;
            }
            map.put(s, false);
        }
        return false;
        
    }

}
