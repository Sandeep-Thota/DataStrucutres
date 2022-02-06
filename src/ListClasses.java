import java.util.ArrayList;
import java.util.*;

public class ListClasses {
	
//	  "array": [5, 1, 22, 25, 6, -1, 8, 10],
//	  "sequence": [1, 6, -1, 10]
	public static void main(String args[]) {
		List<Integer> array = new ArrayList<>();
		array.add(5);
		array.add(1);
		array.add(22);
		array.add(25);
		array.add(6);
		array.add(-1);
		array.add(8);
		array.add(10);
		List<Integer> sequence = new ArrayList<>();
		sequence.add(1);
		sequence.add(6);
		sequence.add(-1);
		sequence.add(10);
		
		System.out.println(isValidSubsequence(array, sequence));
		
	}
	
	  public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		    int i = 0;
				int j= 0;
				while(i< array.size() && j < sequence.size()){
					if(sequence.get(j) == array.get(i)){
						j++;
					}
						i++;
				}
		    return sequence.get(j) == array.get(i);
		  }

}
